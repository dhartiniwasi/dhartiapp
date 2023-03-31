package p282ke;

import java.io.IOException;
import java.net.ProtocolException;
import p244ge.C10355b0;

/* renamed from: ke.k */
/* compiled from: StatusLine */
public final class C11644k {

    /* renamed from: a */
    public final C10355b0 f44217a;

    /* renamed from: b */
    public final int f44218b;

    /* renamed from: c */
    public final String f44219c;

    public C11644k(C10355b0 b0Var, int i, String str) {
        this.f44217a = b0Var;
        this.f44218b = i;
        this.f44219c = str;
    }

    /* renamed from: a */
    public static C11644k m56758a(String str) throws IOException {
        C10355b0 b0Var;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                b0Var = C10355b0.HTTP_1_0;
            } else if (charAt == 1) {
                b0Var = C10355b0.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            b0Var = C10355b0.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                return new C11644k(b0Var, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f44217a == C10355b0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f44218b);
        if (this.f44219c != null) {
            sb.append(' ');
            sb.append(this.f44219c);
        }
        return sb.toString();
    }
}
