public class Transaction {
    /*
    Inner class Transaction.Output and Transaction.Input also exist

    A Transaction output consists of a value & a public key to which the value is
    being paid.
    For our public keys we just use the built-in Java PublicKey class


    A transaction input consists of the hash of the transaction that contains the
    corresponding output, the index of this output in that tx, and the digital signature
    For the tx input to be valid, the signature must be a valid signature over
    the current transaction with the public key in the spent output.


     */
}