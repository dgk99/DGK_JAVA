package lec241007;

public class networkAddress {
    public static void main(String[] args) {

        // 비트 연산자 (Bitwise operator)

        // 왜 사용할까?
        // 정수가 있으면, 각 비트 단위로 연산을 한다

//        int addr1 = 210; // 1101 0010
//        int addr2 = 101; // 0110 0101
//        int addr3 = 236; // 1110 1100
//        int addr4 = 193; // 1100 0001
//
//        int mask1 = 255; // 1111 1111
//        int mask2 = 255; // 1111 1111
//        int mask3 = 255; // 1111 1111
//        int mask4 = 0;   // 0000 0000
//
//        int subAddr1 = addr1 & mask1; // 1101 0010 and 1111 1111
//        // 1101 0010 = 210
//        int subAddr2 = addr2 & mask2; // 0110 0101 and 1111 1111
//        // 0110 0101 = 101
//        int subAddr3 = addr3 & mask3; // 1110 1100 and 1111 1111
//        // 1110 1100 = 236
//        int subAddr4 = addr4 & mask4; // 1100 0001 and 0000 0000
//        // 0000 0000 = 0
//        System.out.println(subAddr1 + "." + subAddr2 + "." + subAddr3 + "." + subAddr4);
//        // result = 210.101.236.0

        // 210.101.236.164
        // D2 .65 .EC .A4
        // Shift operator : >> , <<
        int myIpAddr = 0xD265ECA4;
        // >>와 & 연산자를 조합해서 IPv4 각 자리수를 각 int 형 변수 ipAddr에 저장
        System.out.println(myIpAddr);

        int ipAddr1 = (myIpAddr >> 24) & 0xFF;
        int ipAddr2 = (myIpAddr >> 16) & 0xFF;
        int ipAddr3 = (myIpAddr >> 8) & 0xFF;
        int ipAddr4 = myIpAddr & 0xFF;

        System.out.println(ipAddr1 + "." + ipAddr2 + "." + ipAddr3 + "." + ipAddr4);

//        int bar = 1;
//        int foo = 16;
//        System.out.println(bar << 1);
//        System.out.println(bar << 2);
//        System.out.println(bar << 3);
//        System.out.println(bar << 4);
//
//        System.out.println(foo >> 1);
//        System.out.println(foo >> 2);
//        System.out.println(foo >> 3);
//        System.out.println(foo >> 4);

    }
}
