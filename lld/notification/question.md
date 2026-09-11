# Notification System — LLD

## Requirements

1. The system should allow users to receive notifications.

2. The system should support multiple notification channels:
   - Email
   - SMS
   - Push Notification

3. A notification should contain:
   - Notification ID
   - Recipient
   - Message
   - Timestamp

4. A single notification can be sent through one or multiple channels.

5. Each notification channel should have its own mechanism for sending the notification.

6. Sending a notification through a channel can either succeed or fail.

7. The system should report the result of sending a notification.

8. Users should be able to specify their preferred notification channels.

9. Users should be able to subscribe to or opt out of notification channels.

10. The notification sending workflow should support adding new channels in the future.

11. For example, WhatsApp should be addable as a new notification channel without modifying the existing notification-sending workflow.

12. The system should not require external notification-provider integrations for this exercise.
