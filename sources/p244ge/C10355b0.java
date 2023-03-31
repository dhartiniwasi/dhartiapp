package p244ge;

import java.io.IOException;

/* renamed from: ge.b0 */
/* compiled from: Protocol */
public enum C10355b0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: a */
    private final String f41040a;

    private C10355b0(String str) {
        this.f41040a = str;
    }

    /* renamed from: a */
    public static C10355b0 m52301a(String str) throws IOException {
        C10355b0 b0Var = HTTP_1_0;
        if (str.equals(b0Var.f41040a)) {
            return b0Var;
        }
        C10355b0 b0Var2 = HTTP_1_1;
        if (str.equals(b0Var2.f41040a)) {
            return b0Var2;
        }
        C10355b0 b0Var3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(b0Var3.f41040a)) {
            return b0Var3;
        }
        C10355b0 b0Var4 = HTTP_2;
        if (str.equals(b0Var4.f41040a)) {
            return b0Var4;
        }
        C10355b0 b0Var5 = SPDY_3;
        if (str.equals(b0Var5.f41040a)) {
            return b0Var5;
        }
        C10355b0 b0Var6 = QUIC;
        if (str.equals(b0Var6.f41040a)) {
            return b0Var6;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    public String toString() {
        return this.f41040a;
    }
}
