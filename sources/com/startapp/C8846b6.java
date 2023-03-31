package com.startapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.startapp.b6 */
/* compiled from: Sta */
public class C8846b6 {

    /* renamed from: f */
    public static final Object f36495f = new Object();

    /* renamed from: g */
    public static C8846b6 f36496g;

    /* renamed from: a */
    public final Context f36497a;

    /* renamed from: b */
    public final Map<BroadcastReceiver, ArrayList<IntentFilter>> f36498b = new HashMap();

    /* renamed from: c */
    public final HashMap<String, ArrayList<C8849c>> f36499c = new HashMap<>();

    /* renamed from: d */
    public final ArrayList<C8848b> f36500d = new ArrayList<>();

    /* renamed from: e */
    public final Handler f36501e;

    /* renamed from: com.startapp.b6$a */
    /* compiled from: Sta */
    public class C8847a extends Handler {
        public C8847a(Looper looper) {
            super(looper);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            r3 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r3 >= r1) goto L_0x000b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            r4 = r2[r3];
            r5 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
            if (r5 >= r4.f36504b.size()) goto L_0x004a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
            r6 = r4.f36504b.get(r5).f36506b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
            if (r6 == null) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
            r6.onReceive(r10.f36497a, r4.f36503a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
            r5 = r5 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
            r3 = r3 + 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r10) {
            /*
                r9 = this;
                int r0 = r10.what
                r1 = 1
                if (r0 == r1) goto L_0x0009
                super.handleMessage(r10)
                goto L_0x0017
            L_0x0009:
                com.startapp.b6 r10 = com.startapp.C8846b6.this
            L_0x000b:
                java.util.Map<android.content.BroadcastReceiver, java.util.ArrayList<android.content.IntentFilter>> r0 = r10.f36498b
                monitor-enter(r0)
                java.util.ArrayList<com.startapp.b6$b> r1 = r10.f36500d     // Catch:{ all -> 0x004d }
                int r1 = r1.size()     // Catch:{ all -> 0x004d }
                if (r1 > 0) goto L_0x0018
                monitor-exit(r0)     // Catch:{ all -> 0x004d }
            L_0x0017:
                return
            L_0x0018:
                com.startapp.b6$b[] r2 = new com.startapp.C8846b6.C8848b[r1]     // Catch:{ all -> 0x004d }
                java.util.ArrayList<com.startapp.b6$b> r3 = r10.f36500d     // Catch:{ all -> 0x004d }
                r3.toArray(r2)     // Catch:{ all -> 0x004d }
                java.util.ArrayList<com.startapp.b6$b> r3 = r10.f36500d     // Catch:{ all -> 0x004d }
                r3.clear()     // Catch:{ all -> 0x004d }
                monitor-exit(r0)     // Catch:{ all -> 0x004d }
                r0 = 0
                r3 = 0
            L_0x0027:
                if (r3 >= r1) goto L_0x000b
                r4 = r2[r3]
                r5 = 0
            L_0x002c:
                java.util.ArrayList<com.startapp.b6$c> r6 = r4.f36504b
                int r6 = r6.size()
                if (r5 >= r6) goto L_0x004a
                java.util.ArrayList<com.startapp.b6$c> r6 = r4.f36504b
                java.lang.Object r6 = r6.get(r5)
                com.startapp.b6$c r6 = (com.startapp.C8846b6.C8849c) r6
                android.content.BroadcastReceiver r6 = r6.f36506b
                if (r6 == 0) goto L_0x0047
                android.content.Context r7 = r10.f36497a
                android.content.Intent r8 = r4.f36503a
                r6.onReceive(r7, r8)
            L_0x0047:
                int r5 = r5 + 1
                goto L_0x002c
            L_0x004a:
                int r3 = r3 + 1
                goto L_0x0027
            L_0x004d:
                r10 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004d }
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C8846b6.C8847a.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: com.startapp.b6$b */
    /* compiled from: Sta */
    public static class C8848b {

        /* renamed from: a */
        public final Intent f36503a;

        /* renamed from: b */
        public final ArrayList<C8849c> f36504b;

        public C8848b(Intent intent, ArrayList<C8849c> arrayList) {
            this.f36503a = intent;
            this.f36504b = arrayList;
        }
    }

    /* renamed from: com.startapp.b6$c */
    /* compiled from: Sta */
    public static class C8849c {

        /* renamed from: a */
        public final IntentFilter f36505a;

        /* renamed from: b */
        public final BroadcastReceiver f36506b;

        /* renamed from: c */
        public boolean f36507c;

        public C8849c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f36505a = intentFilter;
            this.f36506b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f36506b);
            sb.append(" filter=");
            sb.append(this.f36505a);
            sb.append("}");
            return sb.toString();
        }
    }

    static {
        C8837b0.m48296a((Class<?>) C8846b6.class);
    }

    public C8846b6(Context context) {
        this.f36497a = context;
        this.f36501e = new C8847a(context.getMainLooper());
    }

    /* renamed from: a */
    public static C8846b6 m48400a(Context context) {
        C8846b6 b6Var;
        synchronized (f36495f) {
            if (f36496g == null) {
                Context a = C9058k0.m48718a(context);
                if (a != null) {
                    context = a;
                }
                f36496g = new C8846b6(context);
            }
            b6Var = f36496g;
        }
        return b6Var;
    }

    /* renamed from: a */
    public void mo29212a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f36498b) {
            C8849c cVar = new C8849c(intentFilter, broadcastReceiver);
            ArrayList arrayList = this.f36498b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f36498b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(intentFilter);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = this.f36499c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f36499c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    /* renamed from: a */
    public void mo29211a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f36498b) {
            ArrayList remove = this.f36498b.remove(broadcastReceiver);
            if (remove != null) {
                for (int i = 0; i < remove.size(); i++) {
                    IntentFilter intentFilter = (IntentFilter) remove.get(i);
                    for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                        String action = intentFilter.getAction(i2);
                        ArrayList arrayList = this.f36499c.get(action);
                        if (arrayList != null) {
                            int i3 = 0;
                            while (i3 < arrayList.size()) {
                                if (((C8849c) arrayList.get(i3)).f36506b == broadcastReceiver) {
                                    arrayList.remove(i3);
                                    i3--;
                                }
                                i3++;
                            }
                            if (arrayList.size() <= 0) {
                                this.f36499c.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b8, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
        return r12;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo29213a(android.content.Intent r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            java.util.Map<android.content.BroadcastReceiver, java.util.ArrayList<android.content.IntentFilter>> r2 = r1.f36498b
            monitor-enter(r2)
            java.lang.String r10 = r22.getAction()     // Catch:{ all -> 0x00bd }
            android.content.Context r3 = r1.f36497a     // Catch:{ all -> 0x00bd }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x00bd }
            java.lang.String r11 = r0.resolveTypeIfNeeded(r3)     // Catch:{ all -> 0x00bd }
            android.net.Uri r12 = r22.getData()     // Catch:{ all -> 0x00bd }
            java.lang.String r13 = r22.getScheme()     // Catch:{ all -> 0x00bd }
            java.util.Set r14 = r22.getCategories()     // Catch:{ all -> 0x00bd }
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.startapp.b6$c>> r3 = r1.f36499c     // Catch:{ all -> 0x00bd }
            java.lang.String r4 = r22.getAction()     // Catch:{ all -> 0x00bd }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x00bd }
            r15 = r3
            java.util.ArrayList r15 = (java.util.ArrayList) r15     // Catch:{ all -> 0x00bd }
            r9 = 0
            if (r15 == 0) goto L_0x00ba
            r3 = 0
            r8 = r3
            r7 = 0
        L_0x0034:
            int r3 = r15.size()     // Catch:{ all -> 0x00bd }
            r6 = 1
            if (r7 >= r3) goto L_0x0089
            java.lang.Object r3 = r15.get(r7)     // Catch:{ all -> 0x00bd }
            r5 = r3
            com.startapp.b6$c r5 = (com.startapp.C8846b6.C8849c) r5     // Catch:{ all -> 0x00bd }
            boolean r3 = r5.f36507c     // Catch:{ all -> 0x00bd }
            if (r3 == 0) goto L_0x0051
            r19 = r7
            r17 = r10
            r18 = r11
            r20 = r12
            r12 = 0
            r11 = r8
            goto L_0x007e
        L_0x0051:
            android.content.IntentFilter r3 = r5.f36505a     // Catch:{ all -> 0x00bd }
            java.lang.String r16 = "LocalBroadcastManager"
            r4 = r10
            r17 = r10
            r10 = r5
            r5 = r11
            r18 = r11
            r11 = 1
            r6 = r13
            r19 = r7
            r7 = r12
            r11 = r8
            r8 = r14
            r20 = r12
            r12 = 0
            r9 = r16
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00bd }
            if (r3 < 0) goto L_0x007e
            if (r11 != 0) goto L_0x0076
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00bd }
            r8.<init>()     // Catch:{ all -> 0x00bd }
            goto L_0x0077
        L_0x0076:
            r8 = r11
        L_0x0077:
            r8.add(r10)     // Catch:{ all -> 0x00bd }
            r3 = 1
            r10.f36507c = r3     // Catch:{ all -> 0x00bd }
            goto L_0x007f
        L_0x007e:
            r8 = r11
        L_0x007f:
            int r7 = r19 + 1
            r10 = r17
            r11 = r18
            r12 = r20
            r9 = 0
            goto L_0x0034
        L_0x0089:
            r11 = r8
            r12 = 0
            if (r11 == 0) goto L_0x00bb
            r9 = 0
        L_0x008e:
            int r3 = r11.size()     // Catch:{ all -> 0x00bd }
            if (r9 >= r3) goto L_0x009f
            java.lang.Object r3 = r11.get(r9)     // Catch:{ all -> 0x00bd }
            com.startapp.b6$c r3 = (com.startapp.C8846b6.C8849c) r3     // Catch:{ all -> 0x00bd }
            r3.f36507c = r12     // Catch:{ all -> 0x00bd }
            int r9 = r9 + 1
            goto L_0x008e
        L_0x009f:
            java.util.ArrayList<com.startapp.b6$b> r3 = r1.f36500d     // Catch:{ all -> 0x00bd }
            com.startapp.b6$b r4 = new com.startapp.b6$b     // Catch:{ all -> 0x00bd }
            r4.<init>(r0, r11)     // Catch:{ all -> 0x00bd }
            r3.add(r4)     // Catch:{ all -> 0x00bd }
            android.os.Handler r0 = r1.f36501e     // Catch:{ all -> 0x00bd }
            r3 = 1
            boolean r0 = r0.hasMessages(r3)     // Catch:{ all -> 0x00bd }
            if (r0 != 0) goto L_0x00b7
            android.os.Handler r0 = r1.f36501e     // Catch:{ all -> 0x00bd }
            r0.sendEmptyMessage(r3)     // Catch:{ all -> 0x00bd }
        L_0x00b7:
            monitor-exit(r2)     // Catch:{ all -> 0x00bd }
            r0 = 1
            return r0
        L_0x00ba:
            r12 = 0
        L_0x00bb:
            monitor-exit(r2)     // Catch:{ all -> 0x00bd }
            return r12
        L_0x00bd:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00bd }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C8846b6.mo29213a(android.content.Intent):boolean");
    }
}
