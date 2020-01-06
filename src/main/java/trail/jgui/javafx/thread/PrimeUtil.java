/*
 * Copyright 2017 JiaweiMao jiaweiM_philo@hotmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package trail.jgui.javafx.thread;

/**
 * @author JiaweiMao
 * @version 1.0.0
 * @since 15 Jan 2018, 4:42 PM
 */
public class PrimeUtil
{
    public static boolean isPrime(long num)
    {
        if (num <= 1 || num % 2 == 0) {
            return false;
        }
        int upperDivisor = (int) Math.ceil(Math.sqrt(num));
        for (int divisor = 3; divisor <= upperDivisor; divisor += 2) {
            if (num % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
