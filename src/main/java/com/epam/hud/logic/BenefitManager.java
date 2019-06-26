package com.epam.hud.logic;

public class BenefitManager extends FinancialManager {
    @Override
    public  int receiveSalary (int nStrings, int beforeSalary, int afterSalary) {
        if (nStrings <= 5000) {
            return beforeSalary * nStrings;
        } else if (nStrings > 5000 && nStrings <= 10000) {
            return beforeSalary * 5000 + afterSalary * (nStrings - 5000);
        } else {
            return (beforeSalary + afterSalary) * 5000 + (nStrings - 10000) * (afterSalary - beforeSalary) * 4;
        }
    }
}
