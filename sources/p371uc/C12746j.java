package p371uc;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: uc.j */
/* compiled from: StatusLine */
public final class C12746j {

    /* renamed from: a */
    public final C12745i f46687a;

    /* renamed from: b */
    public final int f46688b;

    /* renamed from: c */
    public final String f46689c;

    public C12746j(C12745i iVar, int i, String str) {
        this.f46687a = iVar;
        this.f46688b = i;
        this.f46689c = str;
    }

    /* renamed from: a */
    public static C12746j m60426a(String str) throws IOException {
        C12745i iVar;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                iVar = C12745i.HTTP_1_0;
            } else if (charAt == 1) {
                iVar = C12745i.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            iVar = C12745i.HTTP_1_0;
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
                return new C12746j(iVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f46687a == C12745i.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f46688b);
        if (this.f46689c != null) {
            sb.append(' ');
            sb.append(this.f46689c);
        }
        return sb.toString();
    }
}
