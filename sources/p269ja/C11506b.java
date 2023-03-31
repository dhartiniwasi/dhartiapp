package p269ja;

import android.content.ContentValues;
import com.onesignal.C8469j3;
import com.onesignal.C8507n2;
import com.onesignal.C8547p1;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.C11669k;
import org.json.JSONArray;
import org.json.JSONException;
import p249ha.C10488b;
import p249ha.C10490c;
import p278ka.C11602a;
import p278ka.C11603b;
import p278ka.C11605d;
import p278ka.C11606e;

/* renamed from: ja.b */
/* compiled from: OSOutcomeEventsCache.kt */
public final class C11506b {

    /* renamed from: a */
    private final C8547p1 f43933a;

    /* renamed from: b */
    private final C8469j3 f43934b;

    /* renamed from: c */
    private final C8507n2 f43935c;

    public C11506b(C8547p1 p1Var, C8469j3 j3Var, C8507n2 n2Var) {
        C11669k.m56787e(p1Var, "logger");
        C11669k.m56787e(j3Var, "dbHelper");
        C11669k.m56787e(n2Var, "preferences");
        this.f43933a = p1Var;
        this.f43934b = j3Var;
        this.f43935c = n2Var;
    }

    /* renamed from: a */
    private final void m56263a(List<C11602a> list, JSONArray jSONArray, C10488b bVar) {
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = jSONArray.getString(i);
                    C11669k.m56786d(string, "influenceId");
                    list.add(new C11602a(string, bVar));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    private final void m56264b(List<C11602a> list, C11606e eVar) {
        if (eVar != null) {
            JSONArray a = eVar.mo35770a();
            JSONArray b = eVar.mo35771b();
            m56263a(list, a, C10488b.IAM);
            m56263a(list, b, C10488b.NOTIFICATION);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        r7 = r7.mo35766c(r4);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p278ka.C11605d m56265f(p249ha.C10490c r3, p278ka.C11606e r4, p278ka.C11606e r5, java.lang.String r6, p278ka.C11605d r7) {
        /*
            r2 = this;
            int[] r0 = p269ja.C11505a.f43932b
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            r1 = 0
            if (r3 == r0) goto L_0x0027
            r4 = 2
            if (r3 == r4) goto L_0x0010
            goto L_0x003d
        L_0x0010:
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>(r6)
            r5.mo35772c(r3)
            if (r7 == 0) goto L_0x0021
            ka.d r7 = r7.mo35767d(r5)
            if (r7 == 0) goto L_0x0021
            goto L_0x003d
        L_0x0021:
            ka.d r7 = new ka.d
            r7.<init>(r1, r5)
            goto L_0x003d
        L_0x0027:
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>(r6)
            r4.mo35772c(r3)
            if (r7 == 0) goto L_0x0038
            ka.d r7 = r7.mo35766c(r4)
            if (r7 == 0) goto L_0x0038
            goto L_0x003d
        L_0x0038:
            ka.d r7 = new ka.d
            r7.<init>(r4, r1)
        L_0x003d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p269ja.C11506b.m56265f(ha.c, ka.e, ka.e, java.lang.String, ka.d):ka.d");
    }

    /* renamed from: h */
    private final C11605d m56266h(C10490c cVar, C11606e eVar, C11606e eVar2, String str) {
        C11605d dVar;
        int i = C11505a.f43931a[cVar.ordinal()];
        if (i == 1) {
            eVar.mo35773d(new JSONArray(str));
            dVar = new C11605d(eVar, (C11606e) null);
        } else if (i != 2) {
            return null;
        } else {
            eVar2.mo35773d(new JSONArray(str));
            dVar = new C11605d((C11606e) null, eVar2);
        }
        return dVar;
    }

    /* renamed from: c */
    public final synchronized void mo35513c(String str, String str2) {
        C11669k.m56787e(str, "notificationTableName");
        C11669k.m56787e(str2, "notificationIdColumnName");
        StringBuilder sb = new StringBuilder();
        sb.append("NOT EXISTS(SELECT NULL FROM ");
        sb.append(str);
        sb.append(" n ");
        sb.append("WHERE");
        sb.append(" n.");
        sb.append(str2);
        sb.append(" = ");
        sb.append("channel_influence_id");
        sb.append(" AND ");
        sb.append("channel_type");
        sb.append(" = \"");
        String bVar = C10488b.NOTIFICATION.toString();
        Locale locale = Locale.ROOT;
        C11669k.m56786d(locale, "Locale.ROOT");
        if (bVar != null) {
            String lowerCase = bVar.toLowerCase(locale);
            C11669k.m56786d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            sb.append(lowerCase);
            sb.append("\")");
            this.f43934b.mo27886g("cached_unique_outcome", sb.toString(), (String[]) null);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* renamed from: d */
    public final synchronized void mo35514d(C11603b bVar) {
        C11669k.m56787e(bVar, "event");
        this.f43934b.mo27886g("outcome", "timestamp = ?", new String[]{String.valueOf(bVar.mo35758c())});
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c8 A[SYNTHETIC, Splitter:B:40:0x00c8] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<p278ka.C11603b> mo35515e() {
        /*
            r18 = this;
            r7 = r18
            monitor-enter(r18)
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00d2 }
            r8.<init>()     // Catch:{ all -> 0x00d2 }
            r9 = 0
            com.onesignal.j3 r10 = r7.f43934b     // Catch:{ all -> 0x00c5 }
            java.lang.String r11 = "outcome"
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.mo27885f(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00c5 }
            boolean r0 = r10.moveToFirst()     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x00b7
        L_0x001f:
            java.lang.String r0 = "notification_influence_type"
            int r0 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x00c2 }
            ha.c$a r1 = p249ha.C10490c.f41541f     // Catch:{ all -> 0x00c2 }
            ha.c r0 = r1.mo33627a(r0)     // Catch:{ all -> 0x00c2 }
            java.lang.String r2 = "iam_influence_type"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x00c2 }
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x00c2 }
            ha.c r2 = r1.mo33627a(r2)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = "notification_ids"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = r10.getString(r1)     // Catch:{ all -> 0x00c2 }
            if (r1 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            java.lang.String r1 = "[]"
        L_0x004c:
            java.lang.String r3 = "iam_ids"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x00c2 }
            java.lang.String r3 = r10.getString(r3)     // Catch:{ all -> 0x00c2 }
            if (r3 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            java.lang.String r3 = "[]"
        L_0x005b:
            r5 = r3
            java.lang.String r3 = "name"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x00c2 }
            java.lang.String r12 = r10.getString(r3)     // Catch:{ all -> 0x00c2 }
            java.lang.String r3 = "weight"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x00c2 }
            float r14 = r10.getFloat(r3)     // Catch:{ all -> 0x00c2 }
            java.lang.String r3 = "timestamp"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x00c2 }
            long r15 = r10.getLong(r3)     // Catch:{ all -> 0x00c2 }
            ka.e r3 = new ka.e     // Catch:{ JSONException -> 0x00a9 }
            r4 = 3
            r3.<init>(r9, r9, r4, r9)     // Catch:{ JSONException -> 0x00a9 }
            ka.e r6 = new ka.e     // Catch:{ JSONException -> 0x00a9 }
            r6.<init>(r9, r9, r4, r9)     // Catch:{ JSONException -> 0x00a9 }
            ka.d r0 = r7.m56266h(r0, r3, r6, r1)     // Catch:{ JSONException -> 0x00a9 }
            r1 = r18
            r4 = r6
            r6 = r0
            r1.m56265f(r2, r3, r4, r5, r6)     // Catch:{ JSONException -> 0x00a9 }
            if (r0 == 0) goto L_0x0094
        L_0x0092:
            r13 = r0
            goto L_0x009a
        L_0x0094:
            ka.d r0 = new ka.d     // Catch:{ JSONException -> 0x00a9 }
            r0.<init>(r9, r9)     // Catch:{ JSONException -> 0x00a9 }
            goto L_0x0092
        L_0x009a:
            ka.b r0 = new ka.b     // Catch:{ JSONException -> 0x00a9 }
            java.lang.String r1 = "name"
            kotlin.jvm.internal.C11669k.m56786d(r12, r1)     // Catch:{ JSONException -> 0x00a9 }
            r11 = r0
            r11.<init>(r12, r13, r14, r15)     // Catch:{ JSONException -> 0x00a9 }
            r8.add(r0)     // Catch:{ JSONException -> 0x00a9 }
            goto L_0x00b1
        L_0x00a9:
            r0 = move-exception
            com.onesignal.p1 r1 = r7.f43933a     // Catch:{ all -> 0x00c2 }
            java.lang.String r2 = "Generating JSONArray from notifications ids outcome:JSON Failed."
            r1.mo28015c(r2, r0)     // Catch:{ all -> 0x00c2 }
        L_0x00b1:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x00c2 }
            if (r0 != 0) goto L_0x001f
        L_0x00b7:
            boolean r0 = r10.isClosed()     // Catch:{ all -> 0x00d2 }
            if (r0 != 0) goto L_0x00c0
            r10.close()     // Catch:{ all -> 0x00d2 }
        L_0x00c0:
            monitor-exit(r18)
            return r8
        L_0x00c2:
            r0 = move-exception
            r9 = r10
            goto L_0x00c6
        L_0x00c5:
            r0 = move-exception
        L_0x00c6:
            if (r9 == 0) goto L_0x00d1
            boolean r1 = r9.isClosed()     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x00d1
            r9.close()     // Catch:{ all -> 0x00d2 }
        L_0x00d1:
            throw r0     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p269ja.C11506b.mo35515e():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0090, code lost:
        if (r4.isClosed() == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a2, code lost:
        if (r4.isClosed() == false) goto L_0x0092;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<p249ha.C10487a> mo35516g(java.lang.String r23, java.util.List<p249ha.C10487a> r24) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            monitor-enter(r22)
            java.lang.String r2 = "name"
            kotlin.jvm.internal.C11669k.m56787e(r0, r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "influences"
            r3 = r24
            kotlin.jvm.internal.C11669k.m56787e(r3, r2)     // Catch:{ all -> 0x00b3 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00b3 }
            r2.<init>()     // Catch:{ all -> 0x00b3 }
            r4 = 0
            java.util.Iterator r3 = r24.iterator()     // Catch:{ JSONException -> 0x0098 }
        L_0x001b:
            boolean r5 = r3.hasNext()     // Catch:{ JSONException -> 0x0098 }
            if (r5 == 0) goto L_0x008a
            java.lang.Object r5 = r3.next()     // Catch:{ JSONException -> 0x0098 }
            ha.a r5 = (p249ha.C10487a) r5     // Catch:{ JSONException -> 0x0098 }
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0098 }
            r6.<init>()     // Catch:{ JSONException -> 0x0098 }
            org.json.JSONArray r7 = r5.mo33610b()     // Catch:{ JSONException -> 0x0098 }
            if (r7 == 0) goto L_0x001b
            int r8 = r7.length()     // Catch:{ JSONException -> 0x0098 }
            r9 = 0
            r10 = 0
        L_0x0038:
            if (r10 >= r8) goto L_0x0079
            java.lang.String r11 = r7.getString(r10)     // Catch:{ JSONException -> 0x0098 }
            ha.b r12 = r5.mo33611c()     // Catch:{ JSONException -> 0x0098 }
            java.lang.String[] r15 = new java.lang.String[r9]     // Catch:{ JSONException -> 0x0098 }
            java.lang.String r16 = "channel_influence_id = ? AND channel_type = ? AND name = ?"
            r13 = 3
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ JSONException -> 0x0098 }
            r14[r9] = r11     // Catch:{ JSONException -> 0x0098 }
            java.lang.String r12 = r12.toString()     // Catch:{ JSONException -> 0x0098 }
            r13 = 1
            r14[r13] = r12     // Catch:{ JSONException -> 0x0098 }
            r12 = 2
            r14[r12] = r0     // Catch:{ JSONException -> 0x0098 }
            com.onesignal.j3 r13 = r1.f43934b     // Catch:{ JSONException -> 0x0098 }
            java.lang.String r12 = "cached_unique_outcome"
            r18 = 0
            r19 = 0
            r20 = 0
            java.lang.String r21 = "1"
            r17 = r14
            r14 = r12
            android.database.Cursor r4 = r13.mo27884b(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ JSONException -> 0x0098 }
            java.lang.String r12 = "cursor"
            kotlin.jvm.internal.C11669k.m56786d(r4, r12)     // Catch:{ JSONException -> 0x0098 }
            int r12 = r4.getCount()     // Catch:{ JSONException -> 0x0098 }
            if (r12 != 0) goto L_0x0076
            r6.put(r11)     // Catch:{ JSONException -> 0x0098 }
        L_0x0076:
            int r10 = r10 + 1
            goto L_0x0038
        L_0x0079:
            int r7 = r6.length()     // Catch:{ JSONException -> 0x0098 }
            if (r7 <= 0) goto L_0x001b
            ha.a r5 = r5.mo33609a()     // Catch:{ JSONException -> 0x0098 }
            r5.mo33613e(r6)     // Catch:{ JSONException -> 0x0098 }
            r2.add(r5)     // Catch:{ JSONException -> 0x0098 }
            goto L_0x001b
        L_0x008a:
            if (r4 == 0) goto L_0x00a5
            boolean r0 = r4.isClosed()     // Catch:{ all -> 0x00b3 }
            if (r0 != 0) goto L_0x00a5
        L_0x0092:
            r4.close()     // Catch:{ all -> 0x00b3 }
            goto L_0x00a5
        L_0x0096:
            r0 = move-exception
            goto L_0x00a7
        L_0x0098:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0096 }
            if (r4 == 0) goto L_0x00a5
            boolean r0 = r4.isClosed()     // Catch:{ all -> 0x00b3 }
            if (r0 != 0) goto L_0x00a5
            goto L_0x0092
        L_0x00a5:
            monitor-exit(r22)
            return r2
        L_0x00a7:
            if (r4 == 0) goto L_0x00b2
            boolean r2 = r4.isClosed()     // Catch:{ all -> 0x00b3 }
            if (r2 != 0) goto L_0x00b2
            r4.close()     // Catch:{ all -> 0x00b3 }
        L_0x00b2:
            throw r0     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r0 = move-exception
            monitor-exit(r22)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p269ja.C11506b.mo35516g(java.lang.String, java.util.List):java.util.List");
    }

    /* renamed from: i */
    public final Set<String> mo35517i() {
        C8507n2 n2Var = this.f43935c;
        return n2Var.mo27978c(n2Var.mo27981f(), "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", (Set<String>) null);
    }

    /* renamed from: j */
    public final boolean mo35518j() {
        C8507n2 n2Var = this.f43935c;
        return n2Var.mo27985j(n2Var.mo27981f(), this.f43935c.mo27983h(), false);
    }

    /* renamed from: k */
    public final synchronized void mo35519k(C11603b bVar) {
        C10490c cVar;
        C11606e b;
        C11606e a;
        C10490c cVar2;
        C11669k.m56787e(bVar, "eventParams");
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        C10490c cVar3 = C10490c.UNATTRIBUTED;
        C11605d b2 = bVar.mo35757b();
        if (b2 == null || (a = b2.mo35764a()) == null) {
            cVar = cVar3;
        } else {
            JSONArray b3 = a.mo35771b();
            if (b3 == null || b3.length() <= 0) {
                cVar2 = cVar3;
            } else {
                JSONArray jSONArray3 = b3;
                cVar2 = C10490c.DIRECT;
                jSONArray = jSONArray3;
            }
            JSONArray a2 = a.mo35770a();
            if (a2 != null && a2.length() > 0) {
                cVar3 = C10490c.DIRECT;
                jSONArray2 = a2;
            }
            cVar = cVar3;
            cVar3 = cVar2;
        }
        C11605d b4 = bVar.mo35757b();
        if (!(b4 == null || (b = b4.mo35765b()) == null)) {
            JSONArray b5 = b.mo35771b();
            if (b5 != null && b5.length() > 0) {
                cVar3 = C10490c.INDIRECT;
                jSONArray = b5;
            }
            JSONArray a3 = b.mo35770a();
            if (a3 != null && a3.length() > 0) {
                cVar = C10490c.INDIRECT;
                jSONArray2 = a3;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("notification_ids", jSONArray.toString());
        contentValues.put("iam_ids", jSONArray2.toString());
        String str = cVar3.toString();
        if (str != null) {
            String lowerCase = str.toLowerCase();
            C11669k.m56786d(lowerCase, "(this as java.lang.String).toLowerCase()");
            contentValues.put("notification_influence_type", lowerCase);
            String str2 = cVar.toString();
            if (str2 != null) {
                String lowerCase2 = str2.toLowerCase();
                C11669k.m56786d(lowerCase2, "(this as java.lang.String).toLowerCase()");
                contentValues.put("iam_influence_type", lowerCase2);
                contentValues.put(MediationMetaData.KEY_NAME, bVar.mo35756a());
                contentValues.put("weight", Float.valueOf(bVar.mo35759d()));
                contentValues.put("timestamp", Long.valueOf(bVar.mo35758c()));
                this.f43934b.mo27887h("outcome", (String) null, contentValues);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* renamed from: l */
    public final void mo35520l(Set<String> set) {
        C8507n2 n2Var = this.f43935c;
        String f = n2Var.mo27981f();
        C11669k.m56784b(set);
        n2Var.mo27982g(f, "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", set);
    }

    /* renamed from: m */
    public final synchronized void mo35521m(C11603b bVar) {
        C11669k.m56787e(bVar, "eventParams");
        C8547p1 p1Var = this.f43933a;
        p1Var.mo28016d("OneSignal saveUniqueOutcomeEventParams: " + bVar);
        String a = bVar.mo35756a();
        ArrayList<C11602a> arrayList = new ArrayList<>();
        C11605d b = bVar.mo35757b();
        C11606e a2 = b != null ? b.mo35764a() : null;
        C11605d b2 = bVar.mo35757b();
        C11606e b3 = b2 != null ? b2.mo35765b() : null;
        m56264b(arrayList, a2);
        m56264b(arrayList, b3);
        for (C11602a aVar : arrayList) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("channel_influence_id", aVar.mo35755b());
            contentValues.put("channel_type", aVar.mo35754a().toString());
            contentValues.put(MediationMetaData.KEY_NAME, a);
            this.f43934b.mo27887h("cached_unique_outcome", (String) null, contentValues);
        }
    }
}
