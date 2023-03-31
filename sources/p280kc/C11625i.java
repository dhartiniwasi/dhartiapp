package p280kc;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p186ac.C6539c;
import p280kc.C11621h;
import p325pc.C12166b;
import p351sb.C12502a;

/* renamed from: kc.i */
/* compiled from: PathProviderPlugin */
public class C11625i implements C12502a, C11621h.C11622a {

    /* renamed from: a */
    private Context f44184a;

    /* renamed from: kc.i$a */
    /* compiled from: PathProviderPlugin */
    static /* synthetic */ class C11626a {

        /* renamed from: a */
        static final /* synthetic */ int[] f44185a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                kc.h$c[] r0 = p280kc.C11621h.C11624c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44185a = r0
                kc.h$c r1 = p280kc.C11621h.C11624c.root     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f44185a     // Catch:{ NoSuchFieldError -> 0x001d }
                kc.h$c r1 = p280kc.C11621h.C11624c.music     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f44185a     // Catch:{ NoSuchFieldError -> 0x0028 }
                kc.h$c r1 = p280kc.C11621h.C11624c.podcasts     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f44185a     // Catch:{ NoSuchFieldError -> 0x0033 }
                kc.h$c r1 = p280kc.C11621h.C11624c.ringtones     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f44185a     // Catch:{ NoSuchFieldError -> 0x003e }
                kc.h$c r1 = p280kc.C11621h.C11624c.alarms     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f44185a     // Catch:{ NoSuchFieldError -> 0x0049 }
                kc.h$c r1 = p280kc.C11621h.C11624c.notifications     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f44185a     // Catch:{ NoSuchFieldError -> 0x0054 }
                kc.h$c r1 = p280kc.C11621h.C11624c.pictures     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f44185a     // Catch:{ NoSuchFieldError -> 0x0060 }
                kc.h$c r1 = p280kc.C11621h.C11624c.movies     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f44185a     // Catch:{ NoSuchFieldError -> 0x006c }
                kc.h$c r1 = p280kc.C11621h.C11624c.downloads     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f44185a     // Catch:{ NoSuchFieldError -> 0x0078 }
                kc.h$c r1 = p280kc.C11621h.C11624c.dcim     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f44185a     // Catch:{ NoSuchFieldError -> 0x0084 }
                kc.h$c r1 = p280kc.C11621h.C11624c.documents     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p280kc.C11625i.C11626a.<clinit>():void");
        }
    }

    /* renamed from: g */
    private String m56691g() {
        return C12166b.m58440d(this.f44184a);
    }

    /* renamed from: h */
    private String m56692h() {
        return C12166b.m58439c(this.f44184a);
    }

    /* renamed from: i */
    private List<String> m56693i() {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.f44184a.getExternalCacheDirs()) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalCacheDir = this.f44184a.getExternalCacheDir();
            if (externalCacheDir != null) {
                arrayList.add(externalCacheDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    private List<String> m56694j(C11621h.C11624c cVar) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.f44184a.getExternalFilesDirs(m56697m(cVar))) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalFilesDir = this.f44184a.getExternalFilesDir(m56697m(cVar));
            if (externalFilesDir != null) {
                arrayList.add(externalFilesDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    private String m56695k() {
        File externalFilesDir = this.f44184a.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    /* renamed from: l */
    private String m56696l() {
        return this.f44184a.getCacheDir().getPath();
    }

    /* renamed from: m */
    private String m56697m(C11621h.C11624c cVar) {
        switch (C11626a.f44185a[cVar.ordinal()]) {
            case 1:
                return null;
            case 2:
                return "music";
            case 3:
                return "podcasts";
            case 4:
                return "ringtones";
            case 5:
                return "alarms";
            case 6:
                return "notifications";
            case 7:
                return "pictures";
            case 8:
                return "movies";
            case 9:
                return "downloads";
            case 10:
                return "dcim";
            case 11:
                return "documents";
            default:
                throw new RuntimeException("Unrecognized directory: " + cVar);
        }
    }

    /* renamed from: n */
    private void m56698n(C6539c cVar, Context context) {
        cVar.mo22135b();
        try {
            C11620g.m56682n(cVar, this);
        } catch (Exception e) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e);
        }
        this.f44184a = context;
    }

    /* renamed from: a */
    public List<String> mo35783a() {
        return m56693i();
    }

    /* renamed from: b */
    public List<String> mo35784b(C11621h.C11624c cVar) {
        return m56694j(cVar);
    }

    /* renamed from: c */
    public String mo35785c() {
        return m56695k();
    }

    /* renamed from: d */
    public String mo35786d() {
        return m56696l();
    }

    /* renamed from: e */
    public String mo35787e() {
        return m56692h();
    }

    /* renamed from: f */
    public String mo35788f() {
        return m56691g();
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        m56698n(bVar.mo37293b(), bVar.mo37292a());
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        C11620g.m56682n(bVar.mo37293b(), (C11621h.C11622a) null);
    }
}
