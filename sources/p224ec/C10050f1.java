package p224ec;

import android.app.Activity;
import com.google.firebase.auth.C7819k0;
import com.google.firebase.auth.C7830n0;
import com.google.firebase.auth.C7833o0;
import com.google.firebase.auth.C7837p0;
import com.google.firebase.auth.C7848s0;
import com.google.firebase.auth.FirebaseAuth;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p186ac.C6544d;
import p246h7.C10421l;

/* renamed from: ec.f1 */
/* compiled from: PhoneNumberVerificationStreamHandler */
public class C10050f1 implements C6544d.C6549d {
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final HashMap<Integer, C7837p0.C7838a> f40043s = new HashMap<>();

    /* renamed from: a */
    final AtomicReference<Activity> f40044a;

    /* renamed from: b */
    final FirebaseAuth f40045b;

    /* renamed from: c */
    final String f40046c;

    /* renamed from: d */
    final C7848s0 f40047d;

    /* renamed from: e */
    final int f40048e;

    /* renamed from: f */
    final C10052b f40049f;

    /* renamed from: g */
    final C7819k0 f40050g;

    /* renamed from: h */
    String f40051h;

    /* renamed from: i */
    Integer f40052i;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C6544d.C6546b f40053r;

    /* renamed from: ec.f1$a */
    /* compiled from: PhoneNumberVerificationStreamHandler */
    class C10051a extends C7837p0.C7839b {
        C10051a() {
        }

        /* renamed from: a */
        public void mo16110a(String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("verificationId", str);
            hashMap.put(MediationMetaData.KEY_NAME, "Auth#phoneCodeAutoRetrievalTimeout");
            if (C10050f1.this.f40053r != null) {
                C10050f1.this.f40053r.success(hashMap);
            }
        }

        /* renamed from: b */
        public void mo16111b(String str, C7837p0.C7838a aVar) {
            int hashCode = aVar.hashCode();
            C10050f1.f40043s.put(Integer.valueOf(hashCode), aVar);
            HashMap hashMap = new HashMap();
            hashMap.put("verificationId", str);
            hashMap.put("forceResendingToken", Integer.valueOf(hashCode));
            hashMap.put(MediationMetaData.KEY_NAME, "Auth#phoneCodeSent");
            if (C10050f1.this.f40053r != null) {
                C10050f1.this.f40053r.success(hashMap);
            }
        }

        /* renamed from: c */
        public void mo16112c(C7830n0 n0Var) {
            int hashCode = n0Var.hashCode();
            C10050f1.this.f40049f.mo32664a(n0Var);
            HashMap hashMap = new HashMap();
            hashMap.put("token", Integer.valueOf(hashCode));
            if (n0Var.mo26145L1() != null) {
                hashMap.put("smsCode", n0Var.mo26145L1());
            }
            hashMap.put(MediationMetaData.KEY_NAME, "Auth#phoneVerificationCompleted");
            if (C10050f1.this.f40053r != null) {
                C10050f1.this.f40053r.success(hashMap);
            }
        }

        /* renamed from: d */
        public void mo16113d(C10421l lVar) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", lVar.getLocalizedMessage());
            hashMap.put("details", C10080t0.m51313j0(lVar));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("error", hashMap);
            hashMap2.put(MediationMetaData.KEY_NAME, "Auth#phoneVerificationFailed");
            if (C10050f1.this.f40053r != null) {
                C10050f1.this.f40053r.success(hashMap2);
            }
        }
    }

    /* renamed from: ec.f1$b */
    /* compiled from: PhoneNumberVerificationStreamHandler */
    interface C10052b {
        /* renamed from: a */
        void mo32664a(C7830n0 n0Var);
    }

    public C10050f1(Activity activity, Map<String, Object> map, C7819k0 k0Var, C7848s0 s0Var, C10052b bVar) {
        AtomicReference<Activity> atomicReference = new AtomicReference<>((Object) null);
        this.f40044a = atomicReference;
        atomicReference.set(activity);
        this.f40050g = k0Var;
        this.f40047d = s0Var;
        this.f40045b = C10080t0.m51301f0(map);
        this.f40046c = (String) map.get("phoneNumber");
        Object obj = map.get("timeout");
        Objects.requireNonNull(obj);
        this.f40048e = ((Integer) obj).intValue();
        if (map.containsKey("autoRetrievedSmsCodeForTesting")) {
            this.f40051h = (String) map.get("autoRetrievedSmsCodeForTesting");
        }
        if (map.containsKey("forceResendingToken")) {
            this.f40052i = (Integer) map.get("forceResendingToken");
        }
        this.f40049f = bVar;
    }

    /* renamed from: e */
    public void mo22145e(Object obj, C6544d.C6546b bVar) {
        C7837p0.C7838a aVar;
        this.f40053r = bVar;
        C10051a aVar2 = new C10051a();
        if (this.f40051h != null) {
            this.f40045b.mo26032n().mo26196c(this.f40046c, this.f40051h);
        }
        C7833o0.C7834a aVar3 = new C7833o0.C7834a(this.f40045b);
        aVar3.mo26168b(this.f40044a.get());
        aVar3.mo26169c(aVar2);
        String str = this.f40046c;
        if (str != null) {
            aVar3.mo26173g(str);
        }
        C7819k0 k0Var = this.f40050g;
        if (k0Var != null) {
            aVar3.mo26172f(k0Var);
        }
        C7848s0 s0Var = this.f40047d;
        if (s0Var != null) {
            aVar3.mo26171e(s0Var);
        }
        aVar3.mo26174h(Long.valueOf((long) this.f40048e), TimeUnit.MILLISECONDS);
        Integer num = this.f40052i;
        if (!(num == null || (aVar = f40043s.get(num)) == null)) {
            aVar3.mo26170d(aVar);
        }
        C7837p0.m43480b(aVar3.mo26167a());
    }

    /* renamed from: i */
    public void mo22146i(Object obj) {
        this.f40053r = null;
        this.f40044a.set((Object) null);
    }
}
