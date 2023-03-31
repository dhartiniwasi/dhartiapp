package com.startapp;

import android.content.Context;
import android.content.SharedPreferences;
import com.startapp.sdk.adsbase.remoteconfig.NetworkDiagnosticConfig;
import java.util.concurrent.Executor;

/* renamed from: com.startapp.h7 */
/* compiled from: Sta */
public class C9000h7 {

    /* renamed from: a */
    public final SharedPreferences f36900a;

    /* renamed from: b */
    public final C9047j7 f36901b;

    /* renamed from: c */
    public final Executor f36902c;

    /* renamed from: d */
    public final C8908d3<NetworkDiagnosticConfig> f36903d;

    /* renamed from: e */
    public final Runnable f36904e = new C9001a();

    /* renamed from: f */
    public final C9147n4 f36905f = new C9002b();

    /* renamed from: com.startapp.h7$a */
    /* compiled from: Sta */
    public class C9001a implements Runnable {
        public C9001a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: com.startapp.h7} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: com.startapp.h7} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: com.startapp.h7} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0127 A[Catch:{ all -> 0x0130 }] */
        /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r25 = this;
                java.lang.String r0 = ";"
                r1 = r25
                com.startapp.h7 r2 = com.startapp.C9000h7.this
                com.startapp.sdk.adsbase.remoteconfig.NetworkDiagnosticConfig r3 = r2.mo29450a()
                if (r3 != 0) goto L_0x000e
                goto L_0x0137
            L_0x000e:
                android.content.SharedPreferences r4 = r2.f36900a
                r5 = 0
                java.lang.String r7 = "181bb7005f9db75a"
                long r4 = r4.getLong(r7, r5)
                int r6 = r3.mo31082c()
                r8 = 60000(0xea60, float:8.4078E-41)
                int r6 = r6 * r8
                long r8 = (long) r6
                long r4 = r4 + r8
                long r8 = java.lang.System.currentTimeMillis()
                int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r6 > 0) goto L_0x0137
                r4 = 0
                r5 = 2
                com.startapp.j7 r6 = r2.f36901b     // Catch:{ all -> 0x011e }
                android.database.sqlite.SQLiteDatabase r6 = r6.mo29679a()     // Catch:{ all -> 0x011e }
                r10 = 1
                java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ all -> 0x011e }
                java.lang.String r12 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x011e }
                r13 = 0
                r11[r13] = r12     // Catch:{ all -> 0x011e }
                java.lang.String r12 = "SELECT requestId, statusId, requests.value AS request, statuses.value AS status, COUNT(*), MIN(durationNanos), MAX(durationNanos), AVG(durationNanos), MIN(timeMillis) FROM traces JOIN requests ON requests.id = traces.requestId JOIN statuses ON statuses.id = traces.statusId WHERE timeMillis < ? GROUP BY requestId, statusId"
                android.database.Cursor r4 = r6.rawQuery(r12, r11)     // Catch:{ all -> 0x011e }
                if (r4 == 0) goto L_0x011b
            L_0x0045:
                boolean r6 = r4.moveToNext()     // Catch:{ all -> 0x011e }
                if (r6 == 0) goto L_0x0105
                long r11 = r4.getLong(r13)     // Catch:{ all -> 0x011e }
                long r14 = r4.getLong(r10)     // Catch:{ all -> 0x011e }
                java.lang.String r6 = r4.getString(r5)     // Catch:{ all -> 0x011e }
                r10 = 3
                java.lang.String r10 = r4.getString(r10)     // Catch:{ all -> 0x011e }
                r13 = 4
                r16 = r6
                long r5 = r4.getLong(r13)     // Catch:{ all -> 0x011e }
                int r13 = r3.mo31081b()     // Catch:{ all -> 0x011e }
                r17 = r2
                long r1 = (long) r13
                int r13 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r13 >= 0) goto L_0x0076
                r1 = r25
                r2 = r17
                r5 = 2
                r10 = 1
                r13 = 0
                goto L_0x0045
            L_0x0076:
                r1 = 5
                long r1 = r4.getLong(r1)     // Catch:{ all -> 0x0101 }
                r13 = 6
                r18 = r14
                long r13 = r4.getLong(r13)     // Catch:{ all -> 0x0101 }
                r15 = 7
                r20 = r11
                r12 = r10
                long r10 = r4.getLong(r15)     // Catch:{ all -> 0x0101 }
                r15 = 8
                r22 = r7
                r23 = r8
                long r7 = r4.getLong(r15)     // Catch:{ all -> 0x0101 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0101 }
                r9.<init>()     // Catch:{ all -> 0x0101 }
                r9.append(r5)     // Catch:{ all -> 0x0101 }
                r9.append(r0)     // Catch:{ all -> 0x0101 }
                r9.append(r1)     // Catch:{ all -> 0x0101 }
                r9.append(r0)     // Catch:{ all -> 0x0101 }
                r9.append(r13)     // Catch:{ all -> 0x0101 }
                r9.append(r0)     // Catch:{ all -> 0x0101 }
                r9.append(r10)     // Catch:{ all -> 0x0101 }
                r9.append(r0)     // Catch:{ all -> 0x0101 }
                r9.append(r7)     // Catch:{ all -> 0x0101 }
                r9.append(r0)     // Catch:{ all -> 0x0101 }
                r1 = r23
                r9.append(r1)     // Catch:{ all -> 0x0101 }
                java.lang.String r5 = r9.toString()     // Catch:{ all -> 0x0101 }
                com.startapp.i4 r6 = new com.startapp.i4     // Catch:{ all -> 0x0101 }
                com.startapp.j4 r7 = com.startapp.C9043j4.f36999j     // Catch:{ all -> 0x0101 }
                r6.<init>((com.startapp.C9043j4) r7)     // Catch:{ all -> 0x0101 }
                java.lang.Long r7 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0101 }
                r6.f36956h = r7     // Catch:{ all -> 0x0101 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0101 }
                r7.<init>()     // Catch:{ all -> 0x0101 }
                r8 = r20
                r7.append(r8)     // Catch:{ all -> 0x0101 }
                java.lang.String r8 = ","
                r7.append(r8)     // Catch:{ all -> 0x0101 }
                r8 = r18
                r7.append(r8)     // Catch:{ all -> 0x0101 }
                java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0101 }
                r6.f36959k = r7     // Catch:{ all -> 0x0101 }
                r7 = r16
                r6.f36957i = r7     // Catch:{ all -> 0x0101 }
                r6.f36952d = r12     // Catch:{ all -> 0x0101 }
                r6.f36953e = r5     // Catch:{ all -> 0x0101 }
                r5 = r17
                com.startapp.n4 r7 = r5.f36905f     // Catch:{ all -> 0x0119 }
                r6.mo29472a((com.startapp.C9147n4) r7)     // Catch:{ all -> 0x0119 }
                r8 = r1
                r2 = r5
                r7 = r22
                r5 = 2
                r10 = 1
                r13 = 0
                r1 = r25
                goto L_0x0045
            L_0x0101:
                r0 = move-exception
                r5 = r17
                goto L_0x0120
            L_0x0105:
                r5 = r2
                r22 = r7
                r1 = r8
                android.content.SharedPreferences r0 = r5.f36900a     // Catch:{ all -> 0x0119 }
                android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0119 }
                r3 = r22
                android.content.SharedPreferences$Editor r0 = r0.putLong(r3, r1)     // Catch:{ all -> 0x0119 }
                r0.commit()     // Catch:{ all -> 0x0119 }
                goto L_0x011b
            L_0x0119:
                r0 = move-exception
                goto L_0x0120
            L_0x011b:
                if (r4 == 0) goto L_0x0137
                goto L_0x012c
            L_0x011e:
                r0 = move-exception
                r5 = r2
            L_0x0120:
                r1 = 2
                boolean r1 = r5.mo29451a(r1)     // Catch:{ all -> 0x0130 }
                if (r1 == 0) goto L_0x012a
                com.startapp.C9023i4.m48681a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0130 }
            L_0x012a:
                if (r4 == 0) goto L_0x0137
            L_0x012c:
                r4.close()
                goto L_0x0137
            L_0x0130:
                r0 = move-exception
                if (r4 == 0) goto L_0x0136
                r4.close()
            L_0x0136:
                throw r0
            L_0x0137:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9000h7.C9001a.run():void");
        }
    }

    /* renamed from: com.startapp.h7$b */
    /* compiled from: Sta */
    public class C9002b implements C9147n4 {

        /* renamed from: com.startapp.h7$b$a */
        /* compiled from: Sta */
        public class C9003a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C9023i4 f36908a;

            public C9003a(C9023i4 i4Var) {
                this.f36908a = i4Var;
            }

            public void run() {
                C9004c cVar;
                C9000h7 h7Var = C9000h7.this;
                C9023i4 i4Var = this.f36908a;
                h7Var.getClass();
                Long l = i4Var.f36956h;
                String str = i4Var.f36959k;
                if (str != null) {
                    String[] split = str.split(",");
                    if (!(split.length != 2 || split[0] == null || split[1] == null)) {
                        try {
                            cVar = new C9004c(Long.parseLong(split[0]), Long.parseLong(split[1]));
                        } catch (NumberFormatException unused) {
                        }
                        if (l != null && cVar != null) {
                            try {
                                C9047j7 j7Var = h7Var.f36901b;
                                long j = cVar.f36910a;
                                long j2 = cVar.f36911b;
                                long longValue = l.longValue();
                                j7Var.mo29679a().delete("traces", "requestId = ? AND statusId = ? AND timeMillis < ?", new String[]{String.valueOf(j), String.valueOf(j2), String.valueOf(longValue)});
                                return;
                            } catch (Throwable th) {
                                if (h7Var.mo29451a(4)) {
                                    C9023i4.m48681a(th);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
                cVar = null;
                if (l != null) {
                }
            }
        }

        public C9002b() {
        }

        /* renamed from: a */
        public void mo29453a(C9023i4 i4Var, int i) {
            if (i == 1) {
                C9000h7.this.f36902c.execute(new C9003a(i4Var));
            }
        }
    }

    /* renamed from: com.startapp.h7$c */
    /* compiled from: Sta */
    public static class C9004c {

        /* renamed from: a */
        public final long f36910a;

        /* renamed from: b */
        public final long f36911b;

        public C9004c(long j, long j2) {
            this.f36910a = j;
            this.f36911b = j2;
        }
    }

    public C9000h7(Context context, SharedPreferences sharedPreferences, C9047j7 j7Var, Executor executor, C8908d3<NetworkDiagnosticConfig> d3Var) {
        this.f36900a = sharedPreferences;
        this.f36901b = j7Var;
        this.f36902c = executor;
        this.f36903d = d3Var;
    }

    /* renamed from: a */
    public final NetworkDiagnosticConfig mo29450a() {
        NetworkDiagnosticConfig call = this.f36903d.call();
        if (call == null || !call.mo31084e()) {
            return null;
        }
        return call;
    }

    /* renamed from: a */
    public boolean mo29451a(int i) {
        NetworkDiagnosticConfig a = mo29450a();
        return a != null && (a.mo31080a() & i) == i;
    }
}
