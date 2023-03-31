package com.onesignal;

import android.content.ContentValues;
import com.facebook.ads.AdSDKNotificationListener;
import com.onesignal.C8338d3;
import com.onesignal.C8524o3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.m1 */
/* compiled from: OSInAppMessageRepository */
class C8487m1 {

    /* renamed from: a */
    private final C8475k3 f35691a;

    /* renamed from: b */
    private final C8547p1 f35692b;

    /* renamed from: c */
    private final C8507n2 f35693c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f35694d = 0;

    /* renamed from: com.onesignal.m1$a */
    /* compiled from: OSInAppMessageRepository */
    class C8488a extends JSONObject {

        /* renamed from: a */
        final /* synthetic */ String f35695a;

        /* renamed from: b */
        final /* synthetic */ int f35696b;

        /* renamed from: c */
        final /* synthetic */ String f35697c;

        /* renamed from: d */
        final /* synthetic */ String f35698d;

        /* renamed from: e */
        final /* synthetic */ String f35699e;

        /* renamed from: f */
        final /* synthetic */ boolean f35700f;

        C8488a(String str, int i, String str2, String str3, String str4, boolean z) throws JSONException {
            this.f35695a = str;
            this.f35696b = i;
            this.f35697c = str2;
            this.f35698d = str3;
            this.f35699e = str4;
            this.f35700f = z;
            put("app_id", str);
            put("device_type", i);
            put("player_id", str2);
            put("click_id", str3);
            put("variant_id", str4);
            if (z) {
                put("first_click", true);
            }
        }
    }

    /* renamed from: com.onesignal.m1$b */
    /* compiled from: OSInAppMessageRepository */
    class C8489b extends C8524o3.C8531g {

        /* renamed from: a */
        final /* synthetic */ Set f35702a;

        /* renamed from: b */
        final /* synthetic */ C8496i f35703b;

        C8489b(Set set, C8496i iVar) {
            this.f35702a = set;
            this.f35703b = iVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo27538a(int i, String str, Throwable th) {
            C8487m1.this.m47051u("engagement", i, str);
            this.f35703b.mo27954c(str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo27539b(String str) {
            C8487m1.this.m47052v("engagement", str);
            C8487m1.this.m47053w(this.f35702a);
        }
    }

    /* renamed from: com.onesignal.m1$c */
    /* compiled from: OSInAppMessageRepository */
    class C8490c extends JSONObject {

        /* renamed from: a */
        final /* synthetic */ String f35705a;

        /* renamed from: b */
        final /* synthetic */ String f35706b;

        /* renamed from: c */
        final /* synthetic */ String f35707c;

        /* renamed from: d */
        final /* synthetic */ int f35708d;

        /* renamed from: e */
        final /* synthetic */ String f35709e;

        C8490c(String str, String str2, String str3, int i, String str4) throws JSONException {
            this.f35705a = str;
            this.f35706b = str2;
            this.f35707c = str3;
            this.f35708d = i;
            this.f35709e = str4;
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", i);
            put("page_id", str4);
        }
    }

    /* renamed from: com.onesignal.m1$d */
    /* compiled from: OSInAppMessageRepository */
    class C8491d extends C8524o3.C8531g {

        /* renamed from: a */
        final /* synthetic */ Set f35711a;

        /* renamed from: b */
        final /* synthetic */ C8496i f35712b;

        C8491d(Set set, C8496i iVar) {
            this.f35711a = set;
            this.f35712b = iVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo27538a(int i, String str, Throwable th) {
            C8487m1.this.m47051u("page impression", i, str);
            this.f35712b.mo27954c(str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo27539b(String str) {
            C8487m1.this.m47052v("page impression", str);
            C8487m1.this.mo27937C(this.f35711a);
        }
    }

    /* renamed from: com.onesignal.m1$e */
    /* compiled from: OSInAppMessageRepository */
    class C8492e extends JSONObject {

        /* renamed from: a */
        final /* synthetic */ String f35714a;

        /* renamed from: b */
        final /* synthetic */ String f35715b;

        /* renamed from: c */
        final /* synthetic */ String f35716c;

        /* renamed from: d */
        final /* synthetic */ int f35717d;

        C8492e(String str, String str2, String str3, int i) throws JSONException {
            this.f35714a = str;
            this.f35715b = str2;
            this.f35716c = str3;
            this.f35717d = i;
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", i);
            put("first_impression", true);
        }
    }

    /* renamed from: com.onesignal.m1$f */
    /* compiled from: OSInAppMessageRepository */
    class C8493f extends C8524o3.C8531g {

        /* renamed from: a */
        final /* synthetic */ Set f35719a;

        /* renamed from: b */
        final /* synthetic */ C8496i f35720b;

        C8493f(Set set, C8496i iVar) {
            this.f35719a = set;
            this.f35720b = iVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo27538a(int i, String str, Throwable th) {
            C8487m1.this.m47051u(AdSDKNotificationListener.IMPRESSION_EVENT, i, str);
            this.f35720b.mo27954c(str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo27539b(String str) {
            C8487m1.this.m47052v(AdSDKNotificationListener.IMPRESSION_EVENT, str);
            C8487m1.this.m47054z(this.f35719a);
        }
    }

    /* renamed from: com.onesignal.m1$g */
    /* compiled from: OSInAppMessageRepository */
    class C8494g extends C8524o3.C8531g {

        /* renamed from: a */
        final /* synthetic */ C8496i f35722a;

        C8494g(C8496i iVar) {
            this.f35722a = iVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo27538a(int i, String str, Throwable th) {
            C8487m1.this.m47051u("html", i, str);
            this.f35722a.mo27954c(str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo27539b(String str) {
            this.f35722a.mo27953b(str);
        }
    }

    /* renamed from: com.onesignal.m1$h */
    /* compiled from: OSInAppMessageRepository */
    class C8495h extends C8524o3.C8531g {

        /* renamed from: a */
        final /* synthetic */ C8496i f35724a;

        C8495h(C8496i iVar) {
            this.f35724a = iVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo27538a(int i, String str, Throwable th) {
            C8487m1.this.m47051u("html", i, str);
            JSONObject jSONObject = new JSONObject();
            if (!OSUtils.m46189V(i) || C8487m1.this.f35694d >= OSUtils.f35284a) {
                int unused = C8487m1.this.f35694d = 0;
                try {
                    jSONObject.put("retry", false);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                C8487m1.m47047g(C8487m1.this);
                try {
                    jSONObject.put("retry", true);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            this.f35724a.mo27954c(jSONObject.toString());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo27539b(String str) {
            int unused = C8487m1.this.f35694d = 0;
            this.f35724a.mo27953b(str);
        }
    }

    /* renamed from: com.onesignal.m1$i */
    /* compiled from: OSInAppMessageRepository */
    interface C8496i {
        /* renamed from: b */
        void mo27953b(String str);

        /* renamed from: c */
        void mo27954c(String str);
    }

    C8487m1(C8475k3 k3Var, C8547p1 p1Var, C8507n2 n2Var) {
        this.f35691a = k3Var;
        this.f35692b = p1Var;
        this.f35693c = n2Var;
    }

    /* renamed from: g */
    static /* synthetic */ int m47047g(C8487m1 m1Var) {
        int i = m1Var.f35694d;
        m1Var.f35694d = i + 1;
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = com.onesignal.C8500m3.f35731a;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m47048i(java.util.Set<java.lang.String> r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x001f
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x001f
            java.lang.String r0 = com.onesignal.C8500m3.f35731a
            r1 = 0
            java.lang.String r2 = "PREFS_OS_CLICKED_CLICK_IDS_IAMS"
            java.util.Set r1 = com.onesignal.C8500m3.m47108g(r0, r2, r1)
            if (r1 == 0) goto L_0x001f
            int r3 = r1.size()
            if (r3 <= 0) goto L_0x001f
            r1.removeAll(r5)
            com.onesignal.C8500m3.m47115n(r0, r2, r1)
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8487m1.m47048i(java.util.Set):void");
    }

    /* renamed from: j */
    private void m47049j(Set<String> set) {
        if (set != null && set.size() > 0) {
            String str = C8500m3.f35731a;
            Set<String> g = C8500m3.m47108g(str, "PREFS_OS_DISPLAYED_IAMS", (Set<String>) null);
            Set<String> g2 = C8500m3.m47108g(str, "PREFS_OS_IMPRESSIONED_IAMS", (Set<String>) null);
            if (g != null && g.size() > 0) {
                g.removeAll(set);
                C8500m3.m47115n(str, "PREFS_OS_DISPLAYED_IAMS", g);
            }
            if (g2 != null && g2.size() > 0) {
                g2.removeAll(set);
                C8500m3.m47115n(str, "PREFS_OS_IMPRESSIONED_IAMS", g2);
            }
        }
    }

    /* renamed from: t */
    private String m47050t(String str, String str2, String str3) {
        if (str2 == null) {
            C8547p1 p1Var = this.f35692b;
            p1Var.mo28013a("Unable to find a variant for in-app message " + str);
            return null;
        }
        return "in_app_messages/" + str + "/variants/" + str2 + "/html?app_id=" + str3;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m47051u(String str, int i, String str2) {
        C8547p1 p1Var = this.f35692b;
        p1Var.mo28013a("Encountered a " + i + " error while attempting in-app message " + str + " request: " + str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m47052v(String str, String str2) {
        C8547p1 p1Var = this.f35692b;
        p1Var.mo28016d("Successful post for in-app message " + str + " request: " + str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m47053w(Set<String> set) {
        this.f35693c.mo27982g(C8500m3.f35731a, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", set);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m47054z(Set<String> set) {
        this.f35693c.mo27982g(C8500m3.f35731a, "PREFS_OS_IMPRESSIONED_IAMS", set);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public synchronized void mo27935A(C8323c1 c1Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", c1Var.f36098a);
        contentValues.put("display_quantity", Integer.valueOf(c1Var.mo27645f().mo27922a()));
        contentValues.put("last_display", Long.valueOf(c1Var.mo27645f().mo27923b()));
        contentValues.put("click_ids", c1Var.mo27642d().toString());
        contentValues.put("displayed_in_session", Boolean.valueOf(c1Var.mo27647h()));
        if (this.f35691a.mo27883a("in_app_message", contentValues, "message_id = ?", new String[]{c1Var.f36098a}) == 0) {
            this.f35691a.mo27887h("in_app_message", (String) null, contentValues);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo27936B(Date date) {
        this.f35693c.mo27984i(C8500m3.f35731a, "PREFS_OS_LAST_TIME_IAM_DISMISSED", date != null ? date.toString() : null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo27937C(Set<String> set) {
        this.f35693c.mo27982g(C8500m3.f35731a, "PREFS_OS_PAGE_IMPRESSIONED_IAMS", set);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo27938D(String str, String str2, String str3, int i, String str4, String str5, boolean z, Set<String> set, C8496i iVar) {
        try {
            C8488a aVar = new C8488a(str, i, str2, str5, str3, z);
            StringBuilder sb = new StringBuilder();
            sb.append("in_app_messages/");
            String str6 = str4;
            sb.append(str4);
            sb.append("/click");
            C8524o3.m47238j(sb.toString(), aVar, new C8489b(set, iVar));
        } catch (JSONException e) {
            e.printStackTrace();
            this.f35692b.mo28013a("Unable to execute in-app message action HTTP request due to invalid JSON");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo27939E(String str, String str2, String str3, int i, String str4, Set<String> set, C8496i iVar) {
        try {
            C8492e eVar = new C8492e(str, str2, str3, i);
            C8524o3.m47238j("in_app_messages/" + str4 + "/impression", eVar, new C8493f(set, iVar));
        } catch (JSONException e) {
            e.printStackTrace();
            this.f35692b.mo28013a("Unable to execute in-app message impression HTTP request due to invalid JSON");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo27940F(String str, String str2, String str3, int i, String str4, String str5, Set<String> set, C8496i iVar) {
        try {
            C8490c cVar = new C8490c(str, str2, str3, i, str5);
            StringBuilder sb = new StringBuilder();
            sb.append("in_app_messages/");
            String str6 = str4;
            sb.append(str4);
            sb.append("/pageImpression");
            C8524o3.m47238j(sb.toString(), cVar, new C8491d(set, iVar));
        } catch (JSONException e) {
            e.printStackTrace();
            this.f35692b.mo28013a("Unable to execute in-app message impression HTTP request due to invalid JSON");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0072, code lost:
        if (r12.isClosed() == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo27941h() {
        /*
            r13 = this;
            monitor-enter(r13)
            java.lang.String r0 = "message_id"
            java.lang.String r1 = "click_ids"
            java.lang.String[] r4 = new java.lang.String[]{r0, r1}     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = "last_display < ?"
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b6 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r5
            r5 = 15552000(0xed4e00, double:7.683709E-317)
            long r1 = r1 - r5
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00b6 }
            r2 = 1
            java.lang.String[] r10 = new java.lang.String[r2]     // Catch:{ all -> 0x00b6 }
            r2 = 0
            r10[r2] = r1     // Catch:{ all -> 0x00b6 }
            java.util.Set r1 = com.onesignal.OSUtils.m46179L()     // Catch:{ all -> 0x00b6 }
            java.util.Set r11 = com.onesignal.OSUtils.m46179L()     // Catch:{ all -> 0x00b6 }
            r12 = 0
            com.onesignal.k3 r2 = r13.f35691a     // Catch:{ JSONException -> 0x008e }
            java.lang.String r3 = "in_app_message"
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r0
            r6 = r10
            android.database.Cursor r12 = r2.mo27885f(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ JSONException -> 0x008e }
            if (r12 == 0) goto L_0x0078
            int r2 = r12.getCount()     // Catch:{ JSONException -> 0x008e }
            if (r2 != 0) goto L_0x003f
            goto L_0x0078
        L_0x003f:
            boolean r2 = r12.moveToFirst()     // Catch:{ JSONException -> 0x008e }
            if (r2 == 0) goto L_0x006e
        L_0x0045:
            java.lang.String r2 = "message_id"
            int r2 = r12.getColumnIndex(r2)     // Catch:{ JSONException -> 0x008e }
            java.lang.String r2 = r12.getString(r2)     // Catch:{ JSONException -> 0x008e }
            java.lang.String r3 = "click_ids"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ JSONException -> 0x008e }
            java.lang.String r3 = r12.getString(r3)     // Catch:{ JSONException -> 0x008e }
            r1.add(r2)     // Catch:{ JSONException -> 0x008e }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x008e }
            r2.<init>(r3)     // Catch:{ JSONException -> 0x008e }
            java.util.Set r2 = com.onesignal.OSUtils.m46180M(r2)     // Catch:{ JSONException -> 0x008e }
            r11.addAll(r2)     // Catch:{ JSONException -> 0x008e }
            boolean r2 = r12.moveToNext()     // Catch:{ JSONException -> 0x008e }
            if (r2 != 0) goto L_0x0045
        L_0x006e:
            boolean r2 = r12.isClosed()     // Catch:{ all -> 0x00b6 }
            if (r2 != 0) goto L_0x009b
        L_0x0074:
            r12.close()     // Catch:{ all -> 0x00b6 }
            goto L_0x009b
        L_0x0078:
            com.onesignal.d3$r0 r2 = com.onesignal.C8338d3.C8384r0.DEBUG     // Catch:{ JSONException -> 0x008e }
            java.lang.String r3 = "Attempted to clean 6 month old IAM data, but none exists!"
            com.onesignal.C8338d3.m46594z1(r2, r3)     // Catch:{ JSONException -> 0x008e }
            if (r12 == 0) goto L_0x008a
            boolean r0 = r12.isClosed()     // Catch:{ all -> 0x00b6 }
            if (r0 != 0) goto L_0x008a
            r12.close()     // Catch:{ all -> 0x00b6 }
        L_0x008a:
            monitor-exit(r13)
            return
        L_0x008c:
            r0 = move-exception
            goto L_0x00aa
        L_0x008e:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ all -> 0x008c }
            if (r12 == 0) goto L_0x009b
            boolean r2 = r12.isClosed()     // Catch:{ all -> 0x00b6 }
            if (r2 != 0) goto L_0x009b
            goto L_0x0074
        L_0x009b:
            com.onesignal.k3 r2 = r13.f35691a     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = "in_app_message"
            r2.mo27886g(r3, r0, r10)     // Catch:{ all -> 0x00b6 }
            r13.m47049j(r1)     // Catch:{ all -> 0x00b6 }
            r13.m47048i(r11)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r13)
            return
        L_0x00aa:
            if (r12 == 0) goto L_0x00b5
            boolean r1 = r12.isClosed()     // Catch:{ all -> 0x00b6 }
            if (r1 != 0) goto L_0x00b5
            r12.close()     // Catch:{ all -> 0x00b6 }
        L_0x00b5:
            throw r0     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8487m1.mo27941h():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0072, code lost:
        if (r1.isClosed() == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r1.isClosed() == false) goto L_0x0074;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<com.onesignal.C8323c1> mo27942k() {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0099 }
            r0.<init>()     // Catch:{ all -> 0x0099 }
            r1 = 0
            com.onesignal.k3 r2 = r10.f35691a     // Catch:{ JSONException -> 0x007a }
            java.lang.String r3 = "in_app_message"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r1 = r2.mo27885f(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ JSONException -> 0x007a }
            boolean r2 = r1.moveToFirst()     // Catch:{ JSONException -> 0x007a }
            if (r2 == 0) goto L_0x006e
        L_0x001b:
            java.lang.String r2 = "message_id"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ JSONException -> 0x007a }
            java.lang.String r2 = r1.getString(r2)     // Catch:{ JSONException -> 0x007a }
            java.lang.String r3 = "click_ids"
            int r3 = r1.getColumnIndex(r3)     // Catch:{ JSONException -> 0x007a }
            java.lang.String r3 = r1.getString(r3)     // Catch:{ JSONException -> 0x007a }
            java.lang.String r4 = "display_quantity"
            int r4 = r1.getColumnIndex(r4)     // Catch:{ JSONException -> 0x007a }
            int r4 = r1.getInt(r4)     // Catch:{ JSONException -> 0x007a }
            java.lang.String r5 = "last_display"
            int r5 = r1.getColumnIndex(r5)     // Catch:{ JSONException -> 0x007a }
            long r5 = r1.getLong(r5)     // Catch:{ JSONException -> 0x007a }
            java.lang.String r7 = "displayed_in_session"
            int r7 = r1.getColumnIndex(r7)     // Catch:{ JSONException -> 0x007a }
            int r7 = r1.getInt(r7)     // Catch:{ JSONException -> 0x007a }
            r8 = 1
            if (r7 != r8) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r8 = 0
        L_0x0052:
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ JSONException -> 0x007a }
            r7.<init>(r3)     // Catch:{ JSONException -> 0x007a }
            java.util.Set r3 = com.onesignal.OSUtils.m46180M(r7)     // Catch:{ JSONException -> 0x007a }
            com.onesignal.c1 r7 = new com.onesignal.c1     // Catch:{ JSONException -> 0x007a }
            com.onesignal.l1 r9 = new com.onesignal.l1     // Catch:{ JSONException -> 0x007a }
            r9.<init>(r4, r5)     // Catch:{ JSONException -> 0x007a }
            r7.<init>(r2, r3, r8, r9)     // Catch:{ JSONException -> 0x007a }
            r0.add(r7)     // Catch:{ JSONException -> 0x007a }
            boolean r2 = r1.moveToNext()     // Catch:{ JSONException -> 0x007a }
            if (r2 != 0) goto L_0x001b
        L_0x006e:
            boolean r2 = r1.isClosed()     // Catch:{ all -> 0x0099 }
            if (r2 != 0) goto L_0x008b
        L_0x0074:
            r1.close()     // Catch:{ all -> 0x0099 }
            goto L_0x008b
        L_0x0078:
            r0 = move-exception
            goto L_0x008d
        L_0x007a:
            r2 = move-exception
            com.onesignal.d3$r0 r3 = com.onesignal.C8338d3.C8384r0.ERROR     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = "Generating JSONArray from iam click ids:JSON Failed."
            com.onesignal.C8338d3.m46496b(r3, r4, r2)     // Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x008b
            boolean r2 = r1.isClosed()     // Catch:{ all -> 0x0099 }
            if (r2 != 0) goto L_0x008b
            goto L_0x0074
        L_0x008b:
            monitor-exit(r10)
            return r0
        L_0x008d:
            if (r1 == 0) goto L_0x0098
            boolean r2 = r1.isClosed()     // Catch:{ all -> 0x0099 }
            if (r2 != 0) goto L_0x0098
            r1.close()     // Catch:{ all -> 0x0099 }
        L_0x0098:
            throw r0     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8487m1.mo27942k():java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Set<String> mo27943l() {
        return this.f35693c.mo27978c(C8500m3.f35731a, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", (Set<String>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Set<String> mo27944m() {
        return this.f35693c.mo27978c(C8500m3.f35731a, "PREFS_OS_DISPLAYED_IAMS", (Set<String>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo27945n(String str, String str2, String str3, C8496i iVar) {
        C8524o3.m47233e(m47050t(str2, str3, str), new C8495h(iVar), (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo27946o(String str, String str2, C8496i iVar) {
        C8524o3.m47233e("in_app_messages/device_preview?preview_id=" + str2 + "&app_id=" + str, new C8494g(iVar), (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public Set<String> mo27947p() {
        return this.f35693c.mo27978c(C8500m3.f35731a, "PREFS_OS_IMPRESSIONED_IAMS", (Set<String>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Date mo27948q() {
        String e = this.f35693c.mo27980e(C8500m3.f35731a, "PREFS_OS_LAST_TIME_IAM_DISMISSED", (String) null);
        if (e == null) {
            return null;
        }
        try {
            return new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH).parse(e);
        } catch (ParseException e2) {
            C8338d3.m46594z1(C8338d3.C8384r0.ERROR, e2.getLocalizedMessage());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public String mo27949r() {
        return this.f35693c.mo27980e(C8500m3.f35731a, "PREFS_OS_CACHED_IAMS", (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public Set<String> mo27950s() {
        return this.f35693c.mo27978c(C8500m3.f35731a, "PREFS_OS_PAGE_IMPRESSIONED_IAMS", (Set<String>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo27951x(Set<String> set) {
        this.f35693c.mo27982g(C8500m3.f35731a, "PREFS_OS_DISPLAYED_IAMS", set);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo27952y(String str) {
        this.f35693c.mo27984i(C8500m3.f35731a, "PREFS_OS_CACHED_IAMS", str);
    }
}
