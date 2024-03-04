public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        String word[] = sentence.split(" ");
        if(number > 0 && number <= word.length){
            return word[number - 1];
        }
        else{
            return "Number = " + number + " is out Of Bound";
        }
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
        char[] numArray = number.toCharArray();
        int count = 0;
        for(char num : numArray){
            int  n = Character.getNumericValue(num);
            if(searchForEven && n%2==0){
                count++;
            } else if (!searchForEven && n%2!=0) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
        int minlength = Math.min(wordA.length(), wordB.length());
        for(int i = 0; i < minlength; i++){
            char char1 = wordA.charAt(i);
            char char2 = wordB.charAt(i);
            if(char1 > char2){
                return wordB;
            } else if (char1 < char2) {
                return wordA;
            }
        }
        return minlength == wordA.length() ? wordA : wordB;
    }
}
