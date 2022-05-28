package cn.codesheep.custom;

public final class Short extends Number implements Comparable<Short> {

    private final short value;
    public Short(short value){
        this.value = value;
    }
    public Short(String s){
        this.value = parseShort(s,10);
    }
    public static final short MIN_VALUE = -32768;

    public static final short MAX_VALUE = 32767;

//    public static final Class<Short> TYPE = (Class<Short>) Class.getPrimitiveClass("Shore");

    public static String toString(short s){return Integer.toString((int)s);}

    public static short parseShort(String s,int radix) throws NumberFormatException{
        int i = Integer.parseInt(s, radix);
        if(i<MIN_VALUE || i >MAX_VALUE) throw new NumberFormatException("value out of range value\""+s+"\"+radix"+radix);
        return (short)i;
    }

    public static short parseShort(String s) throws NumberFormatException {
       return parseShort(s,10);
    }

    public static Short valueOf(String s, int radix){
         return valueOf(parseShort(s,radix));
    }

    public static Short valueOf(String s){
         return valueOf(parseShort(s,10));
    }

    public static Short valueOf(short s){
        int offset = 128;
        int sAsInt = s;
        if(sAsInt>=-128&&sAsInt<=127){
            return ShortCache.cache[s+128];
        }
        return new Short(s);
    }


    private static class ShortCache {
        private ShortCache() {
        }

       static final   Short cache[] = new Short[-(-128) + 127 + 1];
        static {
            for(int i=0;i<cache.length;i++){
                cache[i] = new Short((short)(i-128));
            }
        }
    }

    public static Short decode(String s){
        int i = Integer.decode(s);
        if(i<MIN_VALUE || i>MAX_VALUE){
            throw new NumberFormatException("out of range");
        }
        return valueOf((short)i);
    }

    @Override
    public int compareTo(Short o) {
        return Short.compare(this.value,o.value);
    }

    public static int compare(short a,short b){
        return a - b;
    }

    @Override
    public int intValue() {
        return (int)value;
    }

    @Override
    public long longValue() {
        return (long)value;
    }

    @Override
    public float floatValue() {
        return (float)value;
    }

    @Override
    public double doubleValue() {
        return (double)value;
    }
    public String toString(){
        return Integer.toString((int)value);
    }

    @Override
    public int hashCode() {
        return Short.hashCode(this.value);
    }

    public static int hashCode(short value){
        return (int)value;
    }
    public boolean equals(Object obj){
        if(obj instanceof Short){
            return this.value == ((Short)obj).shortValue();
        }
        return  false;
    }
}
