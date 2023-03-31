package p242gc;

import android.os.Handler;
import android.os.Looper;
import com.google.firebase.firestore.C7921l;
import com.google.firebase.firestore.C7947s0;
import com.google.firebase.firestore.C7957x0;
import com.google.firebase.firestore.C7959y;
import com.google.firebase.firestore.C7961y0;
import com.google.firebase.firestore.FirebaseFirestore;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p186ac.C6544d;
import p218e6.C9975i;
import p233fc.C10200w;
import p251hc.C10503a;

/* renamed from: gc.o */
/* compiled from: TransactionStreamHandler */
public class C10326o implements C10317f, C6544d.C6549d {

    /* renamed from: a */
    final C10327a f40945a;

    /* renamed from: b */
    final Semaphore f40946b = new Semaphore(0);

    /* renamed from: c */
    final Map<String, Object> f40947c = new HashMap();

    /* renamed from: d */
    final Handler f40948d = new Handler(Looper.getMainLooper());

    /* renamed from: gc.o$a */
    /* compiled from: TransactionStreamHandler */
    public interface C10327a {
        /* renamed from: a */
        void mo32860a(C7957x0 x0Var);
    }

    public C10326o(C10327a aVar) {
        this.f40945a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ C10200w m52222h(FirebaseFirestore firebaseFirestore, C6544d.C6546b bVar, Long l, C7957x0 x0Var) throws C7959y {
        this.f40945a.mo32860a(x0Var);
        HashMap hashMap = new HashMap();
        hashMap.put("appName", firebaseFirestore.mo26304r().mo33470q());
        this.f40948d.post(new C10325n(bVar, hashMap));
        try {
            if (!this.f40946b.tryAcquire(l.longValue(), TimeUnit.MILLISECONDS)) {
                return C10200w.m51706b(new C7959y("timed out", C7959y.C7960a.DEADLINE_EXCEEDED));
            }
            if (this.f40947c.isEmpty()) {
                return C10200w.m51705a();
            }
            if ("ERROR".equalsIgnoreCase((String) this.f40947c.get("type"))) {
                return C10200w.m51705a();
            }
            for (Map map : (List) this.f40947c.get("commands")) {
                Object obj = map.get("type");
                Objects.requireNonNull(obj);
                String str = (String) obj;
                Object obj2 = map.get("path");
                Objects.requireNonNull(obj2);
                C7921l o = firebaseFirestore.mo26302o((String) obj2);
                Map map2 = (Map) map.get(JsonStorageKeyNames.DATA_KEY);
                char c = 65535;
                switch (str.hashCode()) {
                    case -1785516855:
                        if (str.equals("UPDATE")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 81986:
                        if (str.equals("SET")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 2012838315:
                        if (str.equals("DELETE")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        Objects.requireNonNull(map2);
                        x0Var.mo26467i(o, map2);
                        break;
                    case 1:
                        Object obj3 = map.get("options");
                        Objects.requireNonNull(obj3);
                        Map map3 = (Map) obj3;
                        C7947s0 s0Var = null;
                        if (map3.get("merge") != null && ((Boolean) map3.get("merge")).booleanValue()) {
                            s0Var = C7947s0.m43874c();
                        } else if (map3.get("mergeFields") != null) {
                            Object obj4 = map3.get("mergeFields");
                            Objects.requireNonNull(obj4);
                            s0Var = C7947s0.m43875d((List) obj4);
                        }
                        if (s0Var != null) {
                            Objects.requireNonNull(map2);
                            x0Var.mo26466g(o, map2, s0Var);
                            break;
                        } else {
                            Objects.requireNonNull(map2);
                            x0Var.mo26465f(o, map2);
                            break;
                        }
                        break;
                    case 2:
                        x0Var.mo26463b(o);
                        break;
                }
            }
            return C10200w.m51705a();
        } catch (InterruptedException unused) {
            return C10200w.m51706b(new C7959y("interrupted", C7959y.C7960a.DEADLINE_EXCEEDED));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m52223j(C6544d.C6546b bVar, HashMap hashMap) {
        bVar.success(hashMap);
        bVar.mo22142a();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m52224k(FirebaseFirestore firebaseFirestore, C6544d.C6546b bVar, C9975i iVar) {
        HashMap hashMap = new HashMap();
        if (iVar.mo26357l() != null || ((C10200w) iVar.mo26358m()).f40640a != null) {
            Exception l = iVar.mo26357l() != null ? iVar.mo26357l() : ((C10200w) iVar.mo26358m()).f40640a;
            hashMap.put("appName", firebaseFirestore.mo26304r().mo33470q());
            hashMap.put("error", C10503a.m52898a(l));
        } else if (iVar.mo26358m() != null) {
            hashMap.put("complete", Boolean.TRUE);
        }
        this.f40948d.post(new C10324m(bVar, hashMap));
    }

    /* renamed from: a */
    public void mo33163a(Map<String, Object> map) {
        this.f40947c.putAll(map);
        this.f40946b.release();
    }

    /* renamed from: e */
    public void mo22145e(Object obj, C6544d.C6546b bVar) {
        long j;
        Map map = (Map) obj;
        Object obj2 = map.get("firestore");
        Objects.requireNonNull(obj2);
        FirebaseFirestore firebaseFirestore = (FirebaseFirestore) obj2;
        Object obj3 = map.get("timeout");
        if (obj3 instanceof Long) {
            j = (Long) obj3;
        } else if (obj3 instanceof Integer) {
            j = Long.valueOf((long) ((Integer) obj3).intValue());
        } else {
            j = 5000L;
        }
        firebaseFirestore.mo26289I(new C7961y0.C7963b().mo26476b(((Integer) map.get("maxAttempts")).intValue()).mo26475a(), new C10322k(this, firebaseFirestore, bVar, j)).mo26347b(new C10323l(this, firebaseFirestore, bVar));
    }

    /* renamed from: i */
    public void mo22146i(Object obj) {
        this.f40946b.release();
    }
}
