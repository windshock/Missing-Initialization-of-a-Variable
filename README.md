# uninitialized-variable-vulnerability

Sites such as CWE and VULNCAT all describe only code quality and memory problems, so I made an example code for the vulnerability of an uninitialized variable. In the Java language, boolean member variables that are not explicitly initialized are forcibly initialized to false by the compiler. This can lead to logic vulnerabilities. If Java had a type like Python's NoneType, this might not have happened.

This is a java code example of the merchant server that needs to complete the payment after receiving the card payment information from the payment gateway (ex. inicis in korea). Merchant server performs amount validation (OrderPgData.validateAmount()) for paypal payment and does not perform amount validation for card payment. In the case of card payment, amount validation is not performed, but isPaymentAmountTampered variable is initialized to false by the java compiler, and the payment that a hacker modifies the price is completed without any problem by the merchant server.

You might wonder if this will happen, but lazy developers code minimally to only make it work. The rest of the additional features are not coded and are often stated as "future development" in the comments.

You can try running the code online: https://paiza.io/projects/e/W29UBDANL72yP7KFmB9-Vw?theme=twilight

Related documentation:
- https://docs.oracle.com/javase/specs/jls/se7/html/jls-4.html#jls-4.12.5
- https://cwe.mitre.org/data/definitions/457.html
- https://vulncat.fortify.com/en/detail?id=desc.controlflow.cpp.uninitialized_variable#C%2FC%2B%2B
