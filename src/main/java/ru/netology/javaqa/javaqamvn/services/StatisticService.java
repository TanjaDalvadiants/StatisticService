
package ru.netology.javaqa.javaqamvn.services;

public class StatisticService {
    public int getMinSumm(int[] summs) {
        int minSumm = 0;
        for (int i = 0; i <= summs.length; i++) {
            if (summs[i] < summs[minSumm]) {
                minSumm = i;

            }

        }
        return minSumm;
    }
}
