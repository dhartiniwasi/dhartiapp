package p264io.flutter.embedding.android;

import android.view.KeyEvent;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import p186ac.C6539c;
import p264io.flutter.embedding.android.C10654n;
import p264io.flutter.embedding.android.C10661s;
import p264io.flutter.embedding.android.C10669t;

/* renamed from: io.flutter.embedding.android.r */
/* compiled from: KeyEmbedderResponder */
public class C10659r implements C10661s.C10666d {

    /* renamed from: a */
    private final C6539c f41836a;

    /* renamed from: b */
    private final HashMap<Long, Long> f41837b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<Long, C10669t.C10674e> f41838c = new HashMap<>();

    /* renamed from: d */
    private final C10661s.C10663b f41839d = new C10661s.C10663b();

    /* renamed from: io.flutter.embedding.android.r$a */
    /* compiled from: KeyEmbedderResponder */
    static /* synthetic */ class C10660a {

        /* renamed from: a */
        static final /* synthetic */ int[] f41840a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                io.flutter.embedding.android.n$a[] r0 = p264io.flutter.embedding.android.C10654n.C10655a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f41840a = r0
                io.flutter.embedding.android.n$a r1 = p264io.flutter.embedding.android.C10654n.C10655a.kDown     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f41840a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.embedding.android.n$a r1 = p264io.flutter.embedding.android.C10654n.C10655a.kUp     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f41840a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.flutter.embedding.android.n$a r1 = p264io.flutter.embedding.android.C10654n.C10655a.kRepeat     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.flutter.embedding.android.C10659r.C10660a.<clinit>():void");
        }
    }

    public C10659r(C6539c cVar) {
        this.f41836a = cVar;
        for (C10669t.C10674e eVar : C10669t.m53458a()) {
            this.f41838c.put(Long.valueOf(eVar.f41860c), eVar);
        }
    }

    /* renamed from: e */
    private static C10654n.C10655a m53433e(KeyEvent keyEvent) {
        boolean z = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z ? C10654n.C10655a.kRepeat : C10654n.C10655a.kDown;
        }
        if (action == 1) {
            return C10654n.C10655a.kUp;
        }
        throw new AssertionError("Unexpected event type");
    }

    /* renamed from: f */
    private Long m53434f(KeyEvent keyEvent) {
        Long l = C10669t.f41852b.get(Long.valueOf((long) keyEvent.getKeyCode()));
        if (l != null) {
            return l;
        }
        return Long.valueOf(m53437i((long) keyEvent.getKeyCode(), 73014444032L));
    }

    /* renamed from: g */
    private Long m53435g(KeyEvent keyEvent) {
        long scanCode = (long) keyEvent.getScanCode();
        if (scanCode == 0) {
            return Long.valueOf(m53437i((long) keyEvent.getKeyCode(), 73014444032L));
        }
        Long l = C10669t.f41851a.get(Long.valueOf(scanCode));
        if (l != null) {
            return l;
        }
        return Long.valueOf(m53437i((long) keyEvent.getScanCode(), 73014444032L));
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011a A[LOOP:2: B:53:0x0114->B:55:0x011a, LOOP_END] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m53436h(android.view.KeyEvent r18, p264io.flutter.embedding.android.C10661s.C10666d.C10667a r19) {
        /*
            r17 = this;
            r9 = r17
            int r0 = r18.getScanCode()
            r10 = 0
            if (r0 != 0) goto L_0x0010
            int r0 = r18.getKeyCode()
            if (r0 != 0) goto L_0x0010
            return r10
        L_0x0010:
            java.lang.Long r11 = r17.m53435g(r18)
            java.lang.Long r12 = r17.m53434f(r18)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            io.flutter.embedding.android.t$d[] r14 = p264io.flutter.embedding.android.C10669t.f41853c
            int r15 = r14.length
            r8 = 0
        L_0x0021:
            r6 = 1
            if (r8 >= r15) goto L_0x0047
            r1 = r14[r8]
            int r0 = r18.getMetaState()
            int r2 = r1.f41856a
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0031
            r2 = 1
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            long r3 = r12.longValue()
            long r5 = r11.longValue()
            r0 = r17
            r7 = r18
            r16 = r8
            r8 = r13
            r0.mo33986n(r1, r2, r3, r5, r7, r8)
            int r8 = r16 + 1
            goto L_0x0021
        L_0x0047:
            java.util.HashMap<java.lang.Long, io.flutter.embedding.android.t$e> r0 = r9.f41838c
            java.util.Collection r0 = r0.values()
            java.util.Iterator r7 = r0.iterator()
        L_0x0051:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r7.next()
            r1 = r0
            io.flutter.embedding.android.t$e r1 = (p264io.flutter.embedding.android.C10669t.C10674e) r1
            int r0 = r18.getMetaState()
            int r2 = r1.f41858a
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0069
            r2 = 1
            goto L_0x006a
        L_0x0069:
            r2 = 0
        L_0x006a:
            long r3 = r12.longValue()
            r0 = r17
            r5 = r18
            r0.mo33987o(r1, r2, r3, r5)
            goto L_0x0051
        L_0x0076:
            int r0 = r18.getAction()
            if (r0 == 0) goto L_0x0081
            if (r0 == r6) goto L_0x007f
            return r10
        L_0x007f:
            r7 = 0
            goto L_0x0082
        L_0x0081:
            r7 = 1
        L_0x0082:
            java.util.HashMap<java.lang.Long, java.lang.Long> r0 = r9.f41837b
            java.lang.Object r0 = r0.get(r11)
            r2 = r0
            java.lang.Long r2 = (java.lang.Long) r2
            r8 = 0
            if (r7 == 0) goto L_0x00cb
            if (r2 != 0) goto L_0x0093
            io.flutter.embedding.android.n$a r0 = p264io.flutter.embedding.android.C10654n.C10655a.kDown
            goto L_0x00a9
        L_0x0093:
            int r0 = r18.getRepeatCount()
            if (r0 <= 0) goto L_0x009c
            io.flutter.embedding.android.n$a r0 = p264io.flutter.embedding.android.C10654n.C10655a.kRepeat
            goto L_0x00a9
        L_0x009c:
            r1 = 0
            long r4 = r18.getEventTime()
            r0 = r17
            r3 = r11
            r0.m53442p(r1, r2, r3, r4)
            io.flutter.embedding.android.n$a r0 = p264io.flutter.embedding.android.C10654n.C10655a.kDown
        L_0x00a9:
            io.flutter.embedding.android.s$b r1 = r9.f41839d
            int r2 = r18.getUnicodeChar()
            java.lang.Character r1 = r1.mo33991a(r2)
            char r1 = r1.charValue()
            if (r1 == 0) goto L_0x00d0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x00d1
        L_0x00cb:
            if (r2 != 0) goto L_0x00ce
            return r10
        L_0x00ce:
            io.flutter.embedding.android.n$a r0 = p264io.flutter.embedding.android.C10654n.C10655a.kUp
        L_0x00d0:
            r1 = r8
        L_0x00d1:
            io.flutter.embedding.android.n$a r2 = p264io.flutter.embedding.android.C10654n.C10655a.kRepeat
            if (r0 == r2) goto L_0x00db
            if (r7 == 0) goto L_0x00d8
            r8 = r12
        L_0x00d8:
            r9.mo33988q(r11, r8)
        L_0x00db:
            io.flutter.embedding.android.n$a r2 = p264io.flutter.embedding.android.C10654n.C10655a.kDown
            if (r0 != r2) goto L_0x00ee
            java.util.HashMap<java.lang.Long, io.flutter.embedding.android.t$e> r2 = r9.f41838c
            java.lang.Object r2 = r2.get(r12)
            io.flutter.embedding.android.t$e r2 = (p264io.flutter.embedding.android.C10669t.C10674e) r2
            if (r2 == 0) goto L_0x00ee
            boolean r3 = r2.f41861d
            r3 = r3 ^ r6
            r2.f41861d = r3
        L_0x00ee:
            io.flutter.embedding.android.n r2 = new io.flutter.embedding.android.n
            r2.<init>()
            long r3 = r18.getEventTime()
            r2.f41817a = r3
            r2.f41818b = r0
            long r3 = r12.longValue()
            r2.f41820d = r3
            long r3 = r11.longValue()
            r2.f41819c = r3
            r2.f41822f = r1
            r2.f41821e = r10
            r0 = r19
            r9.m53441m(r2, r0)
            java.util.Iterator r0 = r13.iterator()
        L_0x0114:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0124
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            goto L_0x0114
        L_0x0124:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.flutter.embedding.android.C10659r.m53436h(android.view.KeyEvent, io.flutter.embedding.android.s$d$a):boolean");
    }

    /* renamed from: i */
    private static long m53437i(long j, long j2) {
        return (j & 4294967295L) | j2;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m53438j(C10661s.C10666d.C10667a aVar, ByteBuffer byteBuffer) {
        Boolean bool = Boolean.FALSE;
        byteBuffer.rewind();
        if (byteBuffer.capacity() != 0) {
            bool = Boolean.valueOf(byteBuffer.get() != 0);
        }
        aVar.mo33993a(bool.booleanValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m53439k(C10669t.C10672c cVar, long j, KeyEvent keyEvent) {
        m53442p(false, Long.valueOf(cVar.f41855b), Long.valueOf(j), keyEvent.getEventTime());
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m53440l(C10669t.C10672c cVar, KeyEvent keyEvent) {
        m53442p(false, Long.valueOf(cVar.f41855b), Long.valueOf(cVar.f41854a), keyEvent.getEventTime());
    }

    /* renamed from: m */
    private void m53441m(C10654n nVar, C10661s.C10666d.C10667a aVar) {
        this.f41836a.mo22138f("flutter/keydata", nVar.mo33982a(), aVar == null ? null : new C10656o(aVar));
    }

    /* renamed from: p */
    private void m53442p(boolean z, Long l, Long l2, long j) {
        C10654n nVar = new C10654n();
        nVar.f41817a = j;
        nVar.f41818b = z ? C10654n.C10655a.kDown : C10654n.C10655a.kUp;
        nVar.f41820d = l.longValue();
        nVar.f41819c = l2.longValue();
        nVar.f41822f = null;
        nVar.f41821e = true;
        if (!(l2.longValue() == 0 || l.longValue() == 0)) {
            if (!z) {
                l = null;
            }
            mo33988q(l2, l);
        }
        m53441m(nVar, (C10661s.C10666d.C10667a) null);
    }

    /* renamed from: a */
    public void mo33981a(KeyEvent keyEvent, C10661s.C10666d.C10667a aVar) {
        if (!m53436h(keyEvent, aVar)) {
            m53442p(true, (Long) null, 0L, 0);
            aVar.mo33993a(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo33986n(C10669t.C10673d dVar, boolean z, long j, long j2, KeyEvent keyEvent, ArrayList<Runnable> arrayList) {
        C10669t.C10673d dVar2 = dVar;
        ArrayList<Runnable> arrayList2 = arrayList;
        C10669t.C10672c[] cVarArr = dVar2.f41857b;
        boolean[] zArr = new boolean[cVarArr.length];
        Boolean[] boolArr = new Boolean[cVarArr.length];
        boolean z2 = false;
        int i = 0;
        while (true) {
            C10669t.C10672c[] cVarArr2 = dVar2.f41857b;
            boolean z3 = true;
            if (i >= cVarArr2.length) {
                break;
            }
            C10669t.C10672c cVar = cVarArr2[i];
            zArr[i] = this.f41837b.containsKey(Long.valueOf(cVar.f41854a));
            if (cVar.f41855b == j) {
                int i2 = C10660a.f41840a[m53433e(keyEvent).ordinal()];
                if (i2 == 1) {
                    KeyEvent keyEvent2 = keyEvent;
                    boolArr[i] = Boolean.FALSE;
                    if (!z) {
                        arrayList2.add(new C10657p(this, cVar, j2, keyEvent));
                    }
                } else if (i2 == 2) {
                    KeyEvent keyEvent3 = keyEvent;
                    boolArr[i] = Boolean.valueOf(zArr[i]);
                } else if (i2 != 3) {
                    KeyEvent keyEvent4 = keyEvent;
                } else {
                    if (!z) {
                        arrayList2.add(new C10658q(this, cVar, keyEvent));
                    } else {
                        KeyEvent keyEvent5 = keyEvent;
                    }
                    boolArr[i] = Boolean.valueOf(zArr[i]);
                }
                z2 = true;
            } else {
                KeyEvent keyEvent6 = keyEvent;
                if (!z2 && !zArr[i]) {
                    z3 = false;
                }
                z2 = z3;
            }
            i++;
        }
        KeyEvent keyEvent7 = keyEvent;
        if (z) {
            for (int i3 = 0; i3 < dVar2.f41857b.length; i3++) {
                if (boolArr[i3] == null) {
                    if (z2) {
                        boolArr[i3] = Boolean.valueOf(zArr[i3]);
                    } else {
                        boolArr[i3] = Boolean.TRUE;
                        z2 = true;
                    }
                }
            }
            if (!z2) {
                boolArr[0] = Boolean.TRUE;
            }
        } else {
            for (int i4 = 0; i4 < dVar2.f41857b.length; i4++) {
                if (boolArr[i4] == null) {
                    boolArr[i4] = Boolean.FALSE;
                }
            }
        }
        for (int i5 = 0; i5 < dVar2.f41857b.length; i5++) {
            if (zArr[i5] != boolArr[i5].booleanValue()) {
                C10669t.C10672c cVar2 = dVar2.f41857b[i5];
                m53442p(boolArr[i5].booleanValue(), Long.valueOf(cVar2.f41855b), Long.valueOf(cVar2.f41854a), keyEvent.getEventTime());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo33987o(C10669t.C10674e eVar, boolean z, long j, KeyEvent keyEvent) {
        if (eVar.f41860c != j && eVar.f41861d != z) {
            boolean z2 = !this.f41837b.containsKey(Long.valueOf(eVar.f41859b));
            if (z2) {
                eVar.f41861d = !eVar.f41861d;
            }
            m53442p(z2, Long.valueOf(eVar.f41860c), Long.valueOf(eVar.f41859b), keyEvent.getEventTime());
            if (!z2) {
                eVar.f41861d = !eVar.f41861d;
            }
            m53442p(!z2, Long.valueOf(eVar.f41860c), Long.valueOf(eVar.f41859b), keyEvent.getEventTime());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo33988q(Long l, Long l2) {
        if (l2 != null) {
            if (this.f41837b.put(l, l2) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (this.f41837b.remove(l) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
