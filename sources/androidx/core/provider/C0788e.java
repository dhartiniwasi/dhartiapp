package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.C0831h;
import java.util.List;

/* renamed from: androidx.core.provider.e */
/* compiled from: FontRequest */
public final class C0788e {

    /* renamed from: a */
    private final String f2355a;

    /* renamed from: b */
    private final String f2356b;

    /* renamed from: c */
    private final String f2357c;

    /* renamed from: d */
    private final List<List<byte[]>> f2358d;

    /* renamed from: e */
    private final int f2359e = 0;

    /* renamed from: f */
    private final String f2360f;

    public C0788e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f2355a = (String) C0831h.m3662f(str);
        this.f2356b = (String) C0831h.m3662f(str2);
        this.f2357c = (String) C0831h.m3662f(str3);
        this.f2358d = (List) C0831h.m3662f(list);
        this.f2360f = m3554a(str, str2, str3);
    }

    /* renamed from: a */
    private String m3554a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List<List<byte[]>> mo3160b() {
        return this.f2358d;
    }

    /* renamed from: c */
    public int mo3161c() {
        return this.f2359e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo3162d() {
        return this.f2360f;
    }

    /* renamed from: e */
    public String mo3163e() {
        return this.f2355a;
    }

    /* renamed from: f */
    public String mo3164f() {
        return this.f2356b;
    }

    /* renamed from: g */
    public String mo3165g() {
        return this.f2357c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2355a + ", mProviderPackage: " + this.f2356b + ", mQuery: " + this.f2357c + ", mCertificates:");
        for (int i = 0; i < this.f2358d.size(); i++) {
            sb.append(" [");
            List list = this.f2358d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f2359e);
        return sb.toString();
    }
}
