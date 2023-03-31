package p371uc;

import java.io.IOException;

/* renamed from: uc.i */
/* compiled from: Protocol */
public enum C12745i {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    

    /* renamed from: a */
    private final String f46686a;

    private C12745i(String str) {
        this.f46686a = str;
    }

    /* renamed from: a */
    public static C12745i m60425a(String str) throws IOException {
        C12745i iVar = HTTP_1_0;
        if (str.equals(iVar.f46686a)) {
            return iVar;
        }
        C12745i iVar2 = HTTP_1_1;
        if (str.equals(iVar2.f46686a)) {
            return iVar2;
        }
        C12745i iVar3 = HTTP_2;
        if (str.equals(iVar3.f46686a)) {
            return iVar3;
        }
        C12745i iVar4 = SPDY_3;
        if (str.equals(iVar4.f46686a)) {
            return iVar4;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    public String toString() {
        return this.f46686a;
    }
}
