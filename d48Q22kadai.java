// s23000
// d48Q22$B$N%3!<%I$r%3%s%Q%$%k%(%i!<$7$J$$$h$&$K=$@5(B

enum Connection {OFFLINE, ONLINE}

class d48Q22kadai {
    public static void main(String[] args){
        Connection s = Connection.OFFLINE;
        if( s == Connection.OFFLINE) {
            s = Connection.ONLINE;
        }
        System.out.println(s);
    }
}

