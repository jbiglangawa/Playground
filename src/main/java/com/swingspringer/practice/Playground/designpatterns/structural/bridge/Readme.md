Bridge is usually to segregate classes into correct segments.

In my example here, there was a need to implement a User object and it needs to be inside
the Payment object, but if we did that we'd end up with a lot of class implementations:
- GCashPaymentGCashUser
- StripePaymentStripeUser
- GCashPaymentStripeUser
- StripePaymentGCashUser

This could be a bad example of doing this, but putting it in a way where a GCashPayment can 
have a StripeUser. If that's the case, we'll end up with 4 classes.

Bridge is to separate the User class in its own interface and implement a separate
GCashUser and StripeUser implementations.
