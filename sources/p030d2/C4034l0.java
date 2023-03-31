package p030d2;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p030d2.C4016g0;
import p155v3.C5794c0;
import p155v3.C5828l;
import p155v3.C5831n;
import p155v3.C5836o0;
import p155v3.C5837p;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6227i;
import p190b7.C6690r;

/* renamed from: d2.l0 */
/* compiled from: HttpMediaDrmCallback */
public final class C4034l0 implements C4041n0 {

    /* renamed from: a */
    private final C5828l.C5829a f23108a;

    /* renamed from: b */
    private final String f23109b;

    /* renamed from: c */
    private final boolean f23110c;

    /* renamed from: d */
    private final Map<String, String> f23111d;

    public C4034l0(String str, boolean z, C5828l.C5829a aVar) {
        C5917a.m34868a(!z || !TextUtils.isEmpty(str));
        this.f23108a = aVar;
        this.f23109b = str;
        this.f23110c = z;
        this.f23111d = new HashMap();
    }

    /* renamed from: c */
    private static byte[] m27819c(C5828l.C5829a aVar, String str, byte[] bArr, Map<String, String> map) throws C4044o0 {
        C5831n nVar;
        C5836o0 o0Var = new C5836o0(aVar.mo20353a());
        C5837p a = new C5837p.C5839b().mo20381j(str).mo20376e(map).mo20375d(2).mo20374c(bArr).mo20373b(1).mo20372a();
        int i = 0;
        C5837p pVar = a;
        while (true) {
            try {
                nVar = new C5831n(o0Var, pVar);
                byte[] U0 = C5953m0.m35109U0(nVar);
                C5953m0.m35146n(nVar);
                return U0;
            } catch (C5794c0 e) {
                String d = m27820d(e, i);
                if (d != null) {
                    i++;
                    pVar = pVar.mo20366a().mo20381j(d).mo20372a();
                    C5953m0.m35146n(nVar);
                } else {
                    throw e;
                }
            } catch (Exception e2) {
                throw new C4044o0(a, (Uri) C5917a.m34872e(o0Var.mo20363r()), o0Var.mo6816i(), o0Var.mo20362q(), e2);
            } catch (Throwable th) {
                C5953m0.m35146n(nVar);
                throw th;
            }
        }
    }

    /* renamed from: d */
    private static String m27820d(C5794c0 c0Var, int i) {
        Map<String, List<String>> map;
        List list;
        int i2 = c0Var.f28789d;
        if (((i2 == 307 || i2 == 308) && i < 5) && (map = c0Var.f28791f) != null && (list = map.get("Location")) != null && !list.isEmpty()) {
            return (String) list.get(0);
        }
        return null;
    }

    /* renamed from: a */
    public byte[] mo17224a(UUID uuid, C4016g0.C4017a aVar) throws C4044o0 {
        String str;
        String b = aVar.mo17201b();
        if (this.f23110c || TextUtils.isEmpty(b)) {
            b = this.f23109b;
        }
        if (!TextUtils.isEmpty(b)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = C6227i.f29964e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else {
                str = C6227i.f29962c.equals(uuid) ? "application/json" : "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f23111d) {
                hashMap.putAll(this.f23111d);
            }
            return m27819c(this.f23108a, b, aVar.mo17200a(), hashMap);
        }
        throw new C4044o0(new C5837p.C5839b().mo20380i(Uri.EMPTY).mo20372a(), Uri.EMPTY, C6690r.m38472k(), 0, new IllegalStateException("No license URL"));
    }

    /* renamed from: b */
    public byte[] mo17225b(UUID uuid, C4016g0.C4020d dVar) throws C4044o0 {
        return m27819c(this.f23108a, dVar.mo17205b() + "&signedRequest=" + C5953m0.m35074D(dVar.mo17204a()), (byte[]) null, Collections.emptyMap());
    }

    /* renamed from: e */
    public void mo17226e(String str, String str2) {
        C5917a.m34872e(str);
        C5917a.m34872e(str2);
        synchronized (this.f23111d) {
            this.f23111d.put(str, str2);
        }
    }
}
