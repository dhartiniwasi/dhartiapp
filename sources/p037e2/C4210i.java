package p037e2;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p044f2.C4254b;
import p051g2.C4350b;
import p058h2.C4441d;
import p065i2.C4651c;
import p071j2.C4727a;
import p078k2.C4858e;
import p085l2.C4912f;
import p092m2.C5017g;
import p092m2.C5021k;
import p099n2.C5109d;
import p106o2.C5166a0;
import p106o2.C5168b;
import p106o2.C5173e;
import p106o2.C5178h;
import p106o2.C5179h0;
import p113p2.C5262b;
import p161w3.C5946k;

/* renamed from: e2.i */
/* compiled from: DefaultExtractorsFactory */
public final class C4210i implements C4221r {

    /* renamed from: n */
    private static final int[] f23544n = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: o */
    private static final C4211a f23545o = new C4211a(C9954h.f39889a);

    /* renamed from: p */
    private static final C4211a f23546p = new C4211a(C9953g.f39888a);

    /* renamed from: b */
    private boolean f23547b;

    /* renamed from: c */
    private boolean f23548c;

    /* renamed from: d */
    private int f23549d;

    /* renamed from: e */
    private int f23550e;

    /* renamed from: f */
    private int f23551f;

    /* renamed from: g */
    private int f23552g;

    /* renamed from: h */
    private int f23553h;

    /* renamed from: i */
    private int f23554i;

    /* renamed from: j */
    private int f23555j;

    /* renamed from: k */
    private int f23556k = 1;

    /* renamed from: l */
    private int f23557l;

    /* renamed from: m */
    private int f23558m = 112800;

    /* renamed from: e2.i$a */
    /* compiled from: DefaultExtractorsFactory */
    private static final class C4211a {

        /* renamed from: a */
        private final C4212a f23559a;

        /* renamed from: b */
        private final AtomicBoolean f23560b = new AtomicBoolean(false);

        /* renamed from: c */
        private Constructor<? extends C4215l> f23561c;

        /* renamed from: e2.i$a$a */
        /* compiled from: DefaultExtractorsFactory */
        public interface C4212a {
            /* renamed from: a */
            Constructor<? extends C4215l> mo17578a() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException;
        }

        public C4211a(C4212a aVar) {
            this.f23559a = aVar;
        }

        /* renamed from: b */
        private Constructor<? extends C4215l> m28445b() {
            synchronized (this.f23560b) {
                if (this.f23560b.get()) {
                    Constructor<? extends C4215l> constructor = this.f23561c;
                    return constructor;
                }
                try {
                    Constructor<? extends C4215l> a = this.f23559a.mo17578a();
                    return a;
                } catch (ClassNotFoundException unused) {
                    this.f23560b.set(true);
                    return this.f23561c;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
        }

        /* renamed from: a */
        public C4215l mo17577a(Object... objArr) {
            Constructor<? extends C4215l> b = m28445b();
            if (b == null) {
                return null;
            }
            try {
                return (C4215l) b.newInstance(objArr);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating extractor", e);
            }
        }
    }

    /* renamed from: e */
    private void m28439e(int i, List<C4215l> list) {
        int i2 = 2;
        switch (i) {
            case 0:
                list.add(new C5168b());
                return;
            case 1:
                list.add(new C5173e());
                return;
            case 2:
                boolean z = this.f23549d | this.f23547b;
                if (!this.f23548c) {
                    i2 = 0;
                }
                list.add(new C5178h(i2 | z ? 1 : 0));
                return;
            case 3:
                boolean z2 = this.f23550e | this.f23547b;
                if (!this.f23548c) {
                    i2 = 0;
                }
                list.add(new C4254b(i2 | z2 ? 1 : 0));
                return;
            case 4:
                C4215l a = f23545o.mo17577a(Integer.valueOf(this.f23551f));
                if (a != null) {
                    list.add(a);
                    return;
                } else {
                    list.add(new C4441d(this.f23551f));
                    return;
                }
            case 5:
                list.add(new C4651c());
                return;
            case 6:
                list.add(new C4858e(this.f23552g));
                return;
            case 7:
                boolean z3 = this.f23555j | this.f23547b;
                if (!this.f23548c) {
                    i2 = 0;
                }
                list.add(new C4912f(i2 | z3 ? 1 : 0));
                return;
            case 8:
                list.add(new C5017g(this.f23554i));
                list.add(new C5021k(this.f23553h));
                return;
            case 9:
                list.add(new C5109d());
                return;
            case 10:
                list.add(new C5166a0());
                return;
            case 11:
                list.add(new C5179h0(this.f23556k, this.f23557l, this.f23558m));
                return;
            case 12:
                list.add(new C5262b());
                return;
            case 14:
                list.add(new C4727a());
                return;
            case 15:
                C4215l a2 = f23546p.mo17577a(new Object[0]);
                if (a2 != null) {
                    list.add(a2);
                    return;
                }
                return;
            case 16:
                list.add(new C4350b());
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static Constructor<? extends C4215l> m28440f() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (!Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke((Object) null, new Object[0]))) {
            return null;
        }
        return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(C4215l.class).getConstructor(new Class[]{Integer.TYPE});
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static Constructor<? extends C4215l> m28441g() throws ClassNotFoundException, NoSuchMethodException {
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(C4215l.class).getConstructor(new Class[0]);
    }

    /* renamed from: a */
    public synchronized C4215l[] mo17574a() {
        return mo17575b(Uri.EMPTY, new HashMap());
    }

    /* renamed from: b */
    public synchronized C4215l[] mo17575b(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr = f23544n;
        arrayList = new ArrayList(iArr.length);
        int b = C5946k.m35049b(map);
        if (b != -1) {
            m28439e(b, arrayList);
        }
        int c = C5946k.m35050c(uri);
        if (!(c == -1 || c == b)) {
            m28439e(c, arrayList);
        }
        for (int i : iArr) {
            if (!(i == b || i == c)) {
                m28439e(i, arrayList);
            }
        }
        return (C4215l[]) arrayList.toArray(new C4215l[arrayList.size()]);
    }

    /* renamed from: h */
    public synchronized C4210i mo17576h(boolean z) {
        this.f23547b = z;
        return this;
    }
}
