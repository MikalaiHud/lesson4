package com.epam.hud.logic;

public abstract class FinancialManager {
    public int receiveSalary(int nStrings, int beforeSalary, int afterSalary) {
        if (nStrings <= 5000) {
            return beforeSalary * nStrings;
        } else {
            return beforeSalary * 5000 + afterSalary * (nStrings - 5000);
        }
    }
}
