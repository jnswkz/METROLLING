/**
 * VOQ
 */
import java.util.List;
import java.util.ArrayList;

class VariableLengthQuantity
{
    List<String> encode(List<Long> numbers){
        List<String> result = new ArrayList<String>();
        for(int i=0;i<numbers.size();i++){
            long num = numbers.get(i);
            String binary = "";
            while(num>0){
                binary = (num%2)+binary;
                num/=2;
            }
            result.add(binary);
        }
        return result;
    }
    List<String> decode(List<String> bytes){
        List<String> result = new ArrayList<String>();
        for(int i=0;i<bytes.size();i++){
            String binary = bytes.get(i);
            long num = 0;
            for(int j=0;j<binary.length();j++){
                num = num*2 + (binary.charAt(j)-'0');
            }
            result.add(Long.toString(num));
        }
        return result;
    }
}

public class VOQ {

    public static void main(String[] args) {
        
    }
}