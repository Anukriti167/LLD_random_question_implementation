import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public interface Rule {
    RuleResult evaluate(Expense expense, CreditCard creditCard);
}

public class RestuarantRule implements Rule {
    double limit;
    public RestuarantRule(double limit){
        this.limit = limit;
    }
    @Override
    public RuleResult evaluate(Expense expense, CreditCard creditCard){
        if(expense.getCategory() == ExpenseCategory.RESTAURANT && expense.getAmount() > limit){
            return new RuleResult(false,"FAILED: Payment limit exceed " + limit);
        }
        return new RuleResult(true, "PASSED: Under limit for restaurant");
    }
}

public class AirFareRule implements Rule {
    public AirFareRule(){
    }
    @Override
    public RuleResult evaluate(Expense expense, CreditCard creditCard){
        if(expense.getCategory() == ExpenseCategory.AIRFARE){
            return new RuleResult(false, "FAILED: AirFare transactions are not allowed");
        }
        return new RuleResult(true, "PASSED: Transaction allowed for this");
    }
}

public class ExpenseThresholdRule implements Rule {
    private final double limit;
    public ExpenseThresholdRule(double limit){
        this.limit = limit;
    }
    @Override
    public RuleResult evaluate(Expense expense, CreditCard creditCard){
        if(expense.getAmount() >= limit){
            return new RuleResult(false, "FAILED: Amount exceeds limit of" + limit);
        }
        return new RuleResult(true, "PASSED: Amount within limits");
    }
}

@Getter
public class RuleResult {
    boolean passed;
    String reason;
    public RuleResult(boolean passed, String reason){
        this.passed = passed;
        this.reason = reason;
    }

    public boolean isPassed(){
        return this.passed;
    }
}

@Getter
@Setter
public class Expense{
    String expenseId;
    Double amount;
    ExpenseCategory category;
    public Expense(String expenseId, double amount, ExpenseCategory category){
        this.expenseId = expenseId;
        this.amount = amount;
        this.category = category;
    }
}

enum ExpenseCategory{
    RESTAURANT,
    AIRFARE,
    SHOPPING,
    HOTEL
}

public class CreditCard{
    String cardId;
    public CreditCard(String cardId){
        this.cardId = cardId;
    }
}

public class RuleEngine{
    private List<Rule> rules;
    public RuleEngine(List<Rule> rules){
        this.rules = rules;
    }

    public List<RuleResult> processExpense(Expense expense, CreditCard card){
        List<RuleResult> results = new ArrayList<>();

        for(Rule rule: rules){
            RuleResult res = rule.evaluate(expense, card);

            if(!res.isPassed()){
                results.add(res);
            }
        }
        return results;
    }
}

public class ExpenseService {
    private final RuleEngine ruleEngine;
    public ExpenseService(RuleEngine ruleEngine){
        this.ruleEngine = ruleEngine;
    }

    public List<FlaggedExpense> processExpenses(List<Expense> expenses, CreditCard card){
        List<FlaggedExpense> flaggedExpenses = new ArrayList<>();
        for(Expense expense: expenses){
            List<RuleResult> results = ruleEngine.processExpense(expense, card);

            if(!results.isEmpty()){
                flaggedExpenses.add(new FlaggedExpense(expense, results));
            }
        }
        return flaggedExpenses;
    }
}

@Getter
public class FlaggedExpense{
    Expense expense;
    List<RuleResult> failedRules;
    public FlaggedExpense(Expense expense, List<RuleResult> failedRules){
        this.expense = expense;
        this.failedRules = failedRules;
    }
}
class Main{
    public static void main(String []args){
        List<Rule> rules = List.of(new RestuarantRule(70),
                new AirFareRule(),
                new ExpenseThresholdRule(250));

        RuleEngine engine = new RuleEngine(rules);
        ExpenseService service = new ExpenseService(engine);

        CreditCard card = new CreditCard("CARD_1");
        List<Expense> expenses = List.of(
                new Expense("E1", 80, ExpenseCategory.RESTAURANT),
                new Expense("E2", 150, ExpenseCategory.SHOPPING),
                new Expense("E3", 300, ExpenseCategory.HOTEL)
        );

        List<FlaggedExpense> flaggedExpenses = service.processExpenses(expenses, card);
        if(flaggedExpenses.isEmpty()){
            System.out.println("All expenses are approved");
        }else{
            for(FlaggedExpense fe: flaggedExpenses){
                System.out.println("Expense " + fe.getExpense().getExpenseId() + "flagged: ");
                for(RuleResult r: fe.getFailedRules()){
                    System.out.println(" - " + r.getReason());
                }
            }
        }
    }
}

/*
Question Link:
Problem statement given

Design a simple rule engine that:

1.Takes a list of credit card expenses
2.Applies a set of rules
3.Flags the expenses that needs review
4.More rules can be added in future.
5.Design needs to be maintainable.

Example Rules
Restaurant expenses should not exceed 70 dollar.
Airfare expenses should not be allowed.
Any expense above 250 dollar should be flagged.

My Doc: https://docs.google.com/document/d/1x9IUUG0G1wDUjJR2mgAcqoRb9vYC3hKLil20ou7XWzU/edit?tab=t.0
* */