public class StringManipulation {

    // Reverse a word
    public static String reverseString(String words){
        String reversed = "";
        String [] wordsArr = words.split("");

        for(int i=wordsArr.length-1; i>=0; i--){
            // System.out.println(wordsArr[i]);
            reversed = reversed + wordsArr[i];
        }
        // System.out.println(reversed);
        System.out.println("Original words: "+words);
        return reversed;
    }

    // Reverse each individual words in a sentence
    public static String reverseSentence(String words){
        String reversed = "";
        String [] sentenceArr = words.split(" ");

        for(int i = 0; i< sentenceArr.length; i++){
            String [] eachSentence = sentenceArr[i].split("");
            for(int j=eachSentence.length -1; j>=0; j--){
                reversed = reversed + eachSentence[j];
            }
            reversed = reversed + " ";
        }
        return reversed;
    }
    public static void main (String [] args) {
        String a = "Hello";
        String b = "My name is Ridwan";
        System.out.println(reverseString(a));
        System.out.println(reverseSentence(b));
    }
}