/**
 * reverse
 */

class ReverseString
{
    public String _rvs(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    String reverse(String inputString){
        return _rvs(inputString);
    }
}
