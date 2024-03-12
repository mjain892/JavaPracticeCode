public class RemoveAllSpecialCharacters
{
    public static void main (String[] args)
    {
        String str = "Hello^^%#$(!)_+ M@yankj";
        System.out.print(removeSpecialCharacters(str));
    }

    private static String removeSpecialCharacters(String str)
    {
        String newStr = str.replaceAll("[%^#$()!_+@]", "");
        return newStr;
    }

}
