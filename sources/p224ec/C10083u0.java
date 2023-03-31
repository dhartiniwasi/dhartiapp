package p224ec;

import com.google.firebase.auth.C7806h;
import com.google.firebase.auth.C7841q;
import com.google.firebase.auth.C7859w;
import com.google.firebase.auth.C7862x;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: ec.u0 */
/* compiled from: FlutterFirebaseAuthPluginException */
public class C10083u0 extends Exception {

    /* renamed from: a */
    private final String f40135a;

    /* renamed from: b */
    private final String f40136b;

    /* renamed from: c */
    private Map<String, Object> f40137c = new HashMap();

    C10083u0(String str, String str2) {
        super(str2, (Throwable) null);
        this.f40135a = str;
        this.f40136b = str2;
    }

    /* renamed from: a */
    static C10083u0 m51368a() {
        return new C10083u0("PROVIDER_ALREADY_LINKED", "User has already been linked to the given provider.");
    }

    /* renamed from: d */
    static C10083u0 m51369d() {
        return new C10083u0("INVALID_CREDENTIAL", "The supplied auth credential is malformed, has expired or is not currently supported.");
    }

    /* renamed from: e */
    static C10083u0 m51370e() {
        return new C10083u0("NO_SUCH_PROVIDER", "User was not linked to an account with the given provider.");
    }

    /* renamed from: f */
    static C10083u0 m51371f() {
        return new C10083u0("NO_CURRENT_USER", "No user currently signed in.");
    }

    /* renamed from: b */
    public Map<String, Object> mo32694b() {
        return this.f40137c;
    }

    /* renamed from: c */
    public String mo32695c() {
        return this.f40135a.toLowerCase(Locale.ROOT).replace("error_", "").replace("_", "-");
    }

    public String getMessage() {
        return this.f40136b;
    }

    C10083u0(String str, String str2, Map<String, Object> map) {
        super(str2, (Throwable) null);
        this.f40135a = str;
        this.f40136b = str2;
        this.f40137c = map;
    }

    C10083u0(Exception exc, Throwable th) {
        super(exc.getMessage(), th);
        String message = exc.getMessage();
        HashMap hashMap = new HashMap();
        String a = exc instanceof C7841q ? ((C7841q) exc).mo26179a() : "UNKNOWN";
        message = exc instanceof C7862x ? ((C7862x) exc).mo26205b() : message;
        if (exc instanceof C7859w) {
            C7859w wVar = (C7859w) exc;
            String b = wVar.mo26199b();
            if (b != null) {
                hashMap.put("email", b);
            }
            C7806h c = wVar.mo26200c();
            if (c != null) {
                hashMap.put("authCredential", C10080t0.m51314j1(c));
            }
        }
        this.f40135a = a;
        this.f40136b = message;
        this.f40137c = hashMap;
    }
}
