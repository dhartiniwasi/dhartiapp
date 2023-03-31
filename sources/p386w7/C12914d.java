package p386w7;

/* renamed from: w7.d */
/* compiled from: Protobuf */
public @interface C12914d {

    /* renamed from: w7.d$a */
    /* compiled from: Protobuf */
    public enum C12915a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    C12915a intEncoding() default C12915a.DEFAULT;

    int tag();
}
