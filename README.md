# uninitialized-variable-vulnerability

In the Java language, boolean member variables that are not explicitly initialized are forcibly initialized to false by the compiler. This can lead to logic vulnerabilities. Does java need something like python's NoneType?

This is a java code example of the merchant server that needs to complete the payment after receiving the card payment information from the payment gateway (ex. inicis in korea). Merchant server performs amount validation (OrderPgData.validateAmount()) for paypal payment and does not perform amount validation for card payment.

You might wonder if this will happen, but lazy developers code minimally to only make it work. The rest of the additional features are not coded and are often stated as "future development" in the comments.

You can try running the code online: https://paiza.io/projects/e/W29UBDANL72yP7KFmB9-Vw?theme=twilight

Related Java documentation: https://docs.oracle.com/javase/specs/jls/se7/html/jls-4.html#jls-4.12.5
