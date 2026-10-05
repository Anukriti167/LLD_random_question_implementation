# Logger System — LLD

## Requirements

1. The system should support logging messages from an application.
2. Each log should contain a timestamp, log level, and message.
3. Supported log levels are `DEBUG`, `INFO`, `WARN`, and `ERROR`.
4. Each log level has a defined severity/priority.
5. The system should allow configuring a minimum log level for a service.
6. Messages below the configured minimum log level should not be logged.
7. Logs should be written to one or more destinations.
8. Initially, the system should support Console and File destinations.
9. Each destination should have its own mechanism for outputting a log.
10. Different services may have different logging configurations.
11. Multiple parts of an application/service can use the logging system.
12. New destination types should be addable without modifying the core logging workflow.
13. The logger should be safe to use concurrently by multiple threads.
14. Log rotation is out of scope.
15. Distributed logging is out of scope.
16. Database-based log storage is out of scope.
17. External logging services are out of scope.

### Out of Scope

- UI
- Authentication
- Network communication
- Log aggregation
- Log rotation
- Distributed logging
- Database persistence
