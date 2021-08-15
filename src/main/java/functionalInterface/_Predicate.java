package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("+7123124124"));
        System.out.println(isPhoneNumberValid("07123124124"));
        System.out.println(isPhoneNumberValidPredicate.test("+7123124124"));
        System.out.println(isPhoneNumberValidPredicate.test("+712312414"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+7") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("+7") && phoneNumber.length() == 11;
}
