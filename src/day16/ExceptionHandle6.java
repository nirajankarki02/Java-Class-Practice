package day16;
//NESTED
public class ExceptionHandle6 {

    public static void main(String[] args) {
        /*
        the sequence should always be:
        try { } -----> catch { }
        OR
        try { } -----> catch { } -----> finally { }
        OR
        try { } -----> finally { }
         */

        /*
        there can be nested try catch within try or catch as needed as well:
        try {try { } -----> catch { } } -------> catch {try { } -----> catch { } }
                 */
    }
}
