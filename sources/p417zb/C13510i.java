package p417zb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p186ac.C6552g;
import p186ac.C6556k;
import p297mb.C11881b;
import p315ob.C12051a;

/* renamed from: zb.i */
/* compiled from: PlatformChannel */
public class C13510i {

    /* renamed from: a */
    public final C6556k f47912a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C13518h f47913b;

    /* renamed from: c */
    final C6556k.C6560c f47914c;

    /* renamed from: zb.i$a */
    /* compiled from: PlatformChannel */
    class C13511a implements C6556k.C6560c {
        C13511a() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:57|58) */
        /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
            r7.error("error", "No such clipboard content format: " + r6, (java.lang.Object) null);
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00fe */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x011f A[Catch:{ JSONException -> 0x0239 }] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x012c A[Catch:{ JSONException -> 0x0239 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMethodCall(p186ac.C6555j r6, p186ac.C6556k.C6561d r7) {
            /*
                r5 = this;
                java.lang.String r0 = "error"
                zb.i r1 = p417zb.C13510i.this
                zb.i$h r1 = r1.f47913b
                if (r1 != 0) goto L_0x000b
                return
            L_0x000b:
                java.lang.String r1 = r6.f30999a
                java.lang.Object r6 = r6.f31000b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Received '"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r3 = "' message."
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "PlatformChannel"
                p297mb.C11881b.m57388f(r3, r2)
                r2 = -1
                r3 = 0
                int r4 = r1.hashCode()     // Catch:{ JSONException -> 0x0239 }
                switch(r4) {
                    case -766342101: goto L_0x00b4;
                    case -720677196: goto L_0x00a9;
                    case -577225884: goto L_0x009f;
                    case -548468504: goto L_0x0095;
                    case -247230243: goto L_0x008b;
                    case -215273374: goto L_0x0081;
                    case 241845679: goto L_0x0077;
                    case 875995648: goto L_0x006c;
                    case 1128339786: goto L_0x0062;
                    case 1390477857: goto L_0x0057;
                    case 1514180520: goto L_0x004b;
                    case 1674312266: goto L_0x0040;
                    case 2119655719: goto L_0x0035;
                    default: goto L_0x0033;
                }     // Catch:{ JSONException -> 0x0239 }
            L_0x0033:
                goto L_0x00be
            L_0x0035:
                java.lang.String r4 = "SystemChrome.setPreferredOrientations"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0239 }
                if (r1 == 0) goto L_0x00be
                r2 = 2
                goto L_0x00be
            L_0x0040:
                java.lang.String r4 = "SystemChrome.setEnabledSystemUIOverlays"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0239 }
                if (r1 == 0) goto L_0x00be
                r2 = 4
                goto L_0x00be
            L_0x004b:
                java.lang.String r4 = "Clipboard.getData"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0239 }
                if (r1 == 0) goto L_0x00be
                r2 = 10
                goto L_0x00be
            L_0x0057:
                java.lang.String r4 = "SystemChrome.setSystemUIOverlayStyle"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0239 }
                if (r1 == 0) goto L_0x00be
                r2 = 8
                goto L_0x00be
            L_0x0062:
                java.lang.String r4 = "SystemChrome.setEnabledSystemUIMode"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0239 }
                if (r1 == 0) goto L_0x00be
                r2 = 5
                goto L_0x00be
            L_0x006c:
                java.lang.String r4 = "Clipboard.hasStrings"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0239 }
                if (r1 == 0) goto L_0x00be
                r2 = 12
                goto L_0x00be
            L_0x0077:
                java.lang.String r4 = "SystemChrome.restoreSystemUIOverlays"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0239 }
                if (r1 == 0) goto L_0x00be
                r2 = 7
                goto L_0x00be
            L_0x0081:
                java.lang.String r4 = "SystemSound.play"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0239 }
                if (r1 == 0) goto L_0x00be
                r2 = 0
                goto L_0x00be
            L_0x008b:
                java.lang.String r4 = "HapticFeedback.vibrate"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0239 }
                if (r1 == 0) goto L_0x00be
                r2 = 1
                goto L_0x00be
            L_0x0095:
                java.lang.String r4 = "SystemChrome.setApplicationSwitcherDescription"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0239 }
                if (r1 == 0) goto L_0x00be
                r2 = 3
                goto L_0x00be
            L_0x009f:
                java.lang.String r4 = "SystemChrome.setSystemUIChangeListener"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0239 }
                if (r1 == 0) goto L_0x00be
                r2 = 6
                goto L_0x00be
            L_0x00a9:
                java.lang.String r4 = "Clipboard.setData"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0239 }
                if (r1 == 0) goto L_0x00be
                r2 = 11
                goto L_0x00be
            L_0x00b4:
                java.lang.String r4 = "SystemNavigator.pop"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0239 }
                if (r1 == 0) goto L_0x00be
                r2 = 9
            L_0x00be:
                java.lang.String r1 = "text"
                switch(r2) {
                    case 0: goto L_0x021d;
                    case 1: goto L_0x0201;
                    case 2: goto L_0x01e1;
                    case 3: goto L_0x01c1;
                    case 4: goto L_0x019f;
                    case 5: goto L_0x017d;
                    case 6: goto L_0x016f;
                    case 7: goto L_0x0161;
                    case 8: goto L_0x013f;
                    case 9: goto L_0x0131;
                    case 10: goto L_0x00f5;
                    case 11: goto L_0x00e1;
                    case 12: goto L_0x00c8;
                    default: goto L_0x00c3;
                }
            L_0x00c3:
                r7.notImplemented()     // Catch:{ JSONException -> 0x0239 }
                goto L_0x0252
            L_0x00c8:
                zb.i r6 = p417zb.C13510i.this     // Catch:{ JSONException -> 0x0239 }
                zb.i$h r6 = r6.f47913b     // Catch:{ JSONException -> 0x0239 }
                boolean r6 = r6.mo34255m()     // Catch:{ JSONException -> 0x0239 }
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0239 }
                r1.<init>()     // Catch:{ JSONException -> 0x0239 }
                java.lang.String r2 = "value"
                r1.put(r2, r6)     // Catch:{ JSONException -> 0x0239 }
                r7.success(r1)     // Catch:{ JSONException -> 0x0239 }
                goto L_0x0252
            L_0x00e1:
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x0239 }
                java.lang.String r6 = r6.getString(r1)     // Catch:{ JSONException -> 0x0239 }
                zb.i r1 = p417zb.C13510i.this     // Catch:{ JSONException -> 0x0239 }
                zb.i$h r1 = r1.f47913b     // Catch:{ JSONException -> 0x0239 }
                r1.mo34247e(r6)     // Catch:{ JSONException -> 0x0239 }
                r7.success(r3)     // Catch:{ JSONException -> 0x0239 }
                goto L_0x0252
            L_0x00f5:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0239 }
                if (r6 == 0) goto L_0x0112
                zb.i$e r6 = p417zb.C13510i.C13515e.m62663a(r6)     // Catch:{ NoSuchFieldException -> 0x00fe }
                goto L_0x0113
            L_0x00fe:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0239 }
                r2.<init>()     // Catch:{ JSONException -> 0x0239 }
                java.lang.String r4 = "No such clipboard content format: "
                r2.append(r4)     // Catch:{ JSONException -> 0x0239 }
                r2.append(r6)     // Catch:{ JSONException -> 0x0239 }
                java.lang.String r6 = r2.toString()     // Catch:{ JSONException -> 0x0239 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x0239 }
            L_0x0112:
                r6 = r3
            L_0x0113:
                zb.i r2 = p417zb.C13510i.this     // Catch:{ JSONException -> 0x0239 }
                zb.i$h r2 = r2.f47913b     // Catch:{ JSONException -> 0x0239 }
                java.lang.CharSequence r6 = r2.mo34246d(r6)     // Catch:{ JSONException -> 0x0239 }
                if (r6 == 0) goto L_0x012c
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0239 }
                r2.<init>()     // Catch:{ JSONException -> 0x0239 }
                r2.put(r1, r6)     // Catch:{ JSONException -> 0x0239 }
                r7.success(r2)     // Catch:{ JSONException -> 0x0239 }
                goto L_0x0252
            L_0x012c:
                r7.success(r3)     // Catch:{ JSONException -> 0x0239 }
                goto L_0x0252
            L_0x0131:
                zb.i r6 = p417zb.C13510i.this     // Catch:{ JSONException -> 0x0239 }
                zb.i$h r6 = r6.f47913b     // Catch:{ JSONException -> 0x0239 }
                r6.mo34243a()     // Catch:{ JSONException -> 0x0239 }
                r7.success(r3)     // Catch:{ JSONException -> 0x0239 }
                goto L_0x0252
            L_0x013f:
                zb.i r1 = p417zb.C13510i.this     // Catch:{ JSONException -> 0x0157, NoSuchFieldException -> 0x0155 }
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x0157, NoSuchFieldException -> 0x0155 }
                zb.i$j r6 = r1.m62657i(r6)     // Catch:{ JSONException -> 0x0157, NoSuchFieldException -> 0x0155 }
                zb.i r1 = p417zb.C13510i.this     // Catch:{ JSONException -> 0x0157, NoSuchFieldException -> 0x0155 }
                zb.i$h r1 = r1.f47913b     // Catch:{ JSONException -> 0x0157, NoSuchFieldException -> 0x0155 }
                r1.mo34254l(r6)     // Catch:{ JSONException -> 0x0157, NoSuchFieldException -> 0x0155 }
                r7.success(r3)     // Catch:{ JSONException -> 0x0157, NoSuchFieldException -> 0x0155 }
                goto L_0x0252
            L_0x0155:
                r6 = move-exception
                goto L_0x0158
            L_0x0157:
                r6 = move-exception
            L_0x0158:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0239 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x0239 }
                goto L_0x0252
            L_0x0161:
                zb.i r6 = p417zb.C13510i.this     // Catch:{ JSONException -> 0x0239 }
                zb.i$h r6 = r6.f47913b     // Catch:{ JSONException -> 0x0239 }
                r6.mo34250h()     // Catch:{ JSONException -> 0x0239 }
                r7.success(r3)     // Catch:{ JSONException -> 0x0239 }
                goto L_0x0252
            L_0x016f:
                zb.i r6 = p417zb.C13510i.this     // Catch:{ JSONException -> 0x0239 }
                zb.i$h r6 = r6.f47913b     // Catch:{ JSONException -> 0x0239 }
                r6.mo34249g()     // Catch:{ JSONException -> 0x0239 }
                r7.success(r3)     // Catch:{ JSONException -> 0x0239 }
                goto L_0x0252
            L_0x017d:
                zb.i r1 = p417zb.C13510i.this     // Catch:{ JSONException -> 0x0195, NoSuchFieldException -> 0x0193 }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0195, NoSuchFieldException -> 0x0193 }
                zb.i$k r6 = r1.m62658j(r6)     // Catch:{ JSONException -> 0x0195, NoSuchFieldException -> 0x0193 }
                zb.i r1 = p417zb.C13510i.this     // Catch:{ JSONException -> 0x0195, NoSuchFieldException -> 0x0193 }
                zb.i$h r1 = r1.f47913b     // Catch:{ JSONException -> 0x0195, NoSuchFieldException -> 0x0193 }
                r1.mo34248f(r6)     // Catch:{ JSONException -> 0x0195, NoSuchFieldException -> 0x0193 }
                r7.success(r3)     // Catch:{ JSONException -> 0x0195, NoSuchFieldException -> 0x0193 }
                goto L_0x0252
            L_0x0193:
                r6 = move-exception
                goto L_0x0196
            L_0x0195:
                r6 = move-exception
            L_0x0196:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0239 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x0239 }
                goto L_0x0252
            L_0x019f:
                zb.i r1 = p417zb.C13510i.this     // Catch:{ JSONException -> 0x01b7, NoSuchFieldException -> 0x01b5 }
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ JSONException -> 0x01b7, NoSuchFieldException -> 0x01b5 }
                java.util.List r6 = r1.m62659k(r6)     // Catch:{ JSONException -> 0x01b7, NoSuchFieldException -> 0x01b5 }
                zb.i r1 = p417zb.C13510i.this     // Catch:{ JSONException -> 0x01b7, NoSuchFieldException -> 0x01b5 }
                zb.i$h r1 = r1.f47913b     // Catch:{ JSONException -> 0x01b7, NoSuchFieldException -> 0x01b5 }
                r1.mo34244b(r6)     // Catch:{ JSONException -> 0x01b7, NoSuchFieldException -> 0x01b5 }
                r7.success(r3)     // Catch:{ JSONException -> 0x01b7, NoSuchFieldException -> 0x01b5 }
                goto L_0x0252
            L_0x01b5:
                r6 = move-exception
                goto L_0x01b8
            L_0x01b7:
                r6 = move-exception
            L_0x01b8:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0239 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x0239 }
                goto L_0x0252
            L_0x01c1:
                zb.i r1 = p417zb.C13510i.this     // Catch:{ JSONException -> 0x01d7 }
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x01d7 }
                zb.i$c r6 = r1.m62655g(r6)     // Catch:{ JSONException -> 0x01d7 }
                zb.i r1 = p417zb.C13510i.this     // Catch:{ JSONException -> 0x01d7 }
                zb.i$h r1 = r1.f47913b     // Catch:{ JSONException -> 0x01d7 }
                r1.mo34245c(r6)     // Catch:{ JSONException -> 0x01d7 }
                r7.success(r3)     // Catch:{ JSONException -> 0x01d7 }
                goto L_0x0252
            L_0x01d7:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0239 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x0239 }
                goto L_0x0252
            L_0x01e1:
                zb.i r1 = p417zb.C13510i.this     // Catch:{ JSONException -> 0x01f8, NoSuchFieldException -> 0x01f6 }
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ JSONException -> 0x01f8, NoSuchFieldException -> 0x01f6 }
                int r6 = r1.m62656h(r6)     // Catch:{ JSONException -> 0x01f8, NoSuchFieldException -> 0x01f6 }
                zb.i r1 = p417zb.C13510i.this     // Catch:{ JSONException -> 0x01f8, NoSuchFieldException -> 0x01f6 }
                zb.i$h r1 = r1.f47913b     // Catch:{ JSONException -> 0x01f8, NoSuchFieldException -> 0x01f6 }
                r1.mo34253k(r6)     // Catch:{ JSONException -> 0x01f8, NoSuchFieldException -> 0x01f6 }
                r7.success(r3)     // Catch:{ JSONException -> 0x01f8, NoSuchFieldException -> 0x01f6 }
                goto L_0x0252
            L_0x01f6:
                r6 = move-exception
                goto L_0x01f9
            L_0x01f8:
                r6 = move-exception
            L_0x01f9:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0239 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x0239 }
                goto L_0x0252
            L_0x0201:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ NoSuchFieldException -> 0x0214 }
                zb.i$g r6 = p417zb.C13510i.C13517g.m62665a(r6)     // Catch:{ NoSuchFieldException -> 0x0214 }
                zb.i r1 = p417zb.C13510i.this     // Catch:{ NoSuchFieldException -> 0x0214 }
                zb.i$h r1 = r1.f47913b     // Catch:{ NoSuchFieldException -> 0x0214 }
                r1.mo34251i(r6)     // Catch:{ NoSuchFieldException -> 0x0214 }
                r7.success(r3)     // Catch:{ NoSuchFieldException -> 0x0214 }
                goto L_0x0252
            L_0x0214:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0239 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x0239 }
                goto L_0x0252
            L_0x021d:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ NoSuchFieldException -> 0x0230 }
                zb.i$i r6 = p417zb.C13510i.C13519i.m62679a(r6)     // Catch:{ NoSuchFieldException -> 0x0230 }
                zb.i r1 = p417zb.C13510i.this     // Catch:{ NoSuchFieldException -> 0x0230 }
                zb.i$h r1 = r1.f47913b     // Catch:{ NoSuchFieldException -> 0x0230 }
                r1.mo34252j(r6)     // Catch:{ NoSuchFieldException -> 0x0230 }
                r7.success(r3)     // Catch:{ NoSuchFieldException -> 0x0230 }
                goto L_0x0252
            L_0x0230:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0239 }
                r7.error(r0, r6, r3)     // Catch:{ JSONException -> 0x0239 }
                goto L_0x0252
            L_0x0239:
                r6 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "JSON error: "
                r1.append(r2)
                java.lang.String r6 = r6.getMessage()
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r7.error(r0, r6, r3)
            L_0x0252:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p417zb.C13510i.C13511a.onMethodCall(ac.j, ac.k$d):void");
        }
    }

    /* renamed from: zb.i$b */
    /* compiled from: PlatformChannel */
    static /* synthetic */ class C13512b {

        /* renamed from: a */
        static final /* synthetic */ int[] f47916a;

        /* renamed from: b */
        static final /* synthetic */ int[] f47917b;

        /* renamed from: c */
        static final /* synthetic */ int[] f47918c;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        static {
            /*
                zb.i$k[] r0 = p417zb.C13510i.C13521k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47918c = r0
                r1 = 1
                zb.i$k r2 = p417zb.C13510i.C13521k.LEAN_BACK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f47918c     // Catch:{ NoSuchFieldError -> 0x001d }
                zb.i$k r3 = p417zb.C13510i.C13521k.IMMERSIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f47918c     // Catch:{ NoSuchFieldError -> 0x0028 }
                zb.i$k r4 = p417zb.C13510i.C13521k.IMMERSIVE_STICKY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f47918c     // Catch:{ NoSuchFieldError -> 0x0033 }
                zb.i$k r5 = p417zb.C13510i.C13521k.EDGE_TO_EDGE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                zb.i$l[] r4 = p417zb.C13510i.C13522l.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f47917b = r4
                zb.i$l r5 = p417zb.C13510i.C13522l.TOP_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = f47917b     // Catch:{ NoSuchFieldError -> 0x004e }
                zb.i$l r5 = p417zb.C13510i.C13522l.BOTTOM_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                zb.i$f[] r4 = p417zb.C13510i.C13516f.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f47916a = r4
                zb.i$f r5 = p417zb.C13510i.C13516f.PORTRAIT_UP     // Catch:{ NoSuchFieldError -> 0x005f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                int[] r1 = f47916a     // Catch:{ NoSuchFieldError -> 0x0069 }
                zb.i$f r4 = p417zb.C13510i.C13516f.PORTRAIT_DOWN     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = f47916a     // Catch:{ NoSuchFieldError -> 0x0073 }
                zb.i$f r1 = p417zb.C13510i.C13516f.LANDSCAPE_LEFT     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f47916a     // Catch:{ NoSuchFieldError -> 0x007d }
                zb.i$f r1 = p417zb.C13510i.C13516f.LANDSCAPE_RIGHT     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p417zb.C13510i.C13512b.<clinit>():void");
        }
    }

    /* renamed from: zb.i$c */
    /* compiled from: PlatformChannel */
    public static class C13513c {

        /* renamed from: a */
        public final int f47919a;

        /* renamed from: b */
        public final String f47920b;

        public C13513c(int i, String str) {
            this.f47919a = i;
            this.f47920b = str;
        }
    }

    /* renamed from: zb.i$d */
    /* compiled from: PlatformChannel */
    public enum C13514d {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");
        

        /* renamed from: a */
        private String f47924a;

        private C13514d(String str) {
            this.f47924a = str;
        }

        /* renamed from: a */
        static C13514d m62662a(String str) throws NoSuchFieldException {
            for (C13514d dVar : values()) {
                if (dVar.f47924a.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    /* renamed from: zb.i$e */
    /* compiled from: PlatformChannel */
    public enum C13515e {
        PLAIN_TEXT("text/plain");
        

        /* renamed from: a */
        private String f47927a;

        private C13515e(String str) {
            this.f47927a = str;
        }

        /* renamed from: a */
        static C13515e m62663a(String str) throws NoSuchFieldException {
            for (C13515e eVar : values()) {
                if (eVar.f47927a.equals(str)) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    /* renamed from: zb.i$f */
    /* compiled from: PlatformChannel */
    public enum C13516f {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");
        

        /* renamed from: a */
        private String f47933a;

        private C13516f(String str) {
            this.f47933a = str;
        }

        /* renamed from: a */
        static C13516f m62664a(String str) throws NoSuchFieldException {
            for (C13516f fVar : values()) {
                if (fVar.f47933a.equals(str)) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    /* renamed from: zb.i$g */
    /* compiled from: PlatformChannel */
    public enum C13517g {
        STANDARD((String) null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");
        

        /* renamed from: a */
        private final String f47940a;

        private C13517g(String str) {
            this.f47940a = str;
        }

        /* renamed from: a */
        static C13517g m62665a(String str) throws NoSuchFieldException {
            for (C13517g gVar : values()) {
                String str2 = gVar.f47940a;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    /* renamed from: zb.i$h */
    /* compiled from: PlatformChannel */
    public interface C13518h {
        /* renamed from: a */
        void mo34243a();

        /* renamed from: b */
        void mo34244b(List<C13522l> list);

        /* renamed from: c */
        void mo34245c(C13513c cVar);

        /* renamed from: d */
        CharSequence mo34246d(C13515e eVar);

        /* renamed from: e */
        void mo34247e(String str);

        /* renamed from: f */
        void mo34248f(C13521k kVar);

        /* renamed from: g */
        void mo34249g();

        /* renamed from: h */
        void mo34250h();

        /* renamed from: i */
        void mo34251i(C13517g gVar);

        /* renamed from: j */
        void mo34252j(C13519i iVar);

        /* renamed from: k */
        void mo34253k(int i);

        /* renamed from: l */
        void mo34254l(C13520j jVar);

        /* renamed from: m */
        boolean mo34255m();
    }

    /* renamed from: zb.i$i */
    /* compiled from: PlatformChannel */
    public enum C13519i {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");
        

        /* renamed from: a */
        private final String f47944a;

        private C13519i(String str) {
            this.f47944a = str;
        }

        /* renamed from: a */
        static C13519i m62679a(String str) throws NoSuchFieldException {
            for (C13519i iVar : values()) {
                if (iVar.f47944a.equals(str)) {
                    return iVar;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    /* renamed from: zb.i$j */
    /* compiled from: PlatformChannel */
    public static class C13520j {

        /* renamed from: a */
        public final Integer f47945a;

        /* renamed from: b */
        public final C13514d f47946b;

        /* renamed from: c */
        public final Boolean f47947c;

        /* renamed from: d */
        public final Integer f47948d;

        /* renamed from: e */
        public final C13514d f47949e;

        /* renamed from: f */
        public final Integer f47950f;

        /* renamed from: g */
        public final Boolean f47951g;

        public C13520j(Integer num, C13514d dVar, Boolean bool, Integer num2, C13514d dVar2, Integer num3, Boolean bool2) {
            this.f47945a = num;
            this.f47946b = dVar;
            this.f47947c = bool;
            this.f47948d = num2;
            this.f47949e = dVar2;
            this.f47950f = num3;
            this.f47951g = bool2;
        }
    }

    /* renamed from: zb.i$k */
    /* compiled from: PlatformChannel */
    public enum C13521k {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");
        

        /* renamed from: a */
        private String f47957a;

        private C13521k(String str) {
            this.f47957a = str;
        }

        /* renamed from: a */
        static C13521k m62680a(String str) throws NoSuchFieldException {
            for (C13521k kVar : values()) {
                if (kVar.f47957a.equals(str)) {
                    return kVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    /* renamed from: zb.i$l */
    /* compiled from: PlatformChannel */
    public enum C13522l {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");
        

        /* renamed from: a */
        private String f47961a;

        private C13522l(String str) {
            this.f47961a = str;
        }

        /* renamed from: a */
        static C13522l m62681a(String str) throws NoSuchFieldException {
            for (C13522l lVar : values()) {
                if (lVar.f47961a.equals(str)) {
                    return lVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public C13510i(C12051a aVar) {
        C13511a aVar2 = new C13511a();
        this.f47914c = aVar2;
        C6556k kVar = new C6556k(aVar, "flutter/platform", C6552g.f30998a);
        this.f47912a = kVar;
        kVar.mo22161e(aVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public C13513c m62655g(JSONObject jSONObject) throws JSONException {
        int i = jSONObject.getInt("primaryColor");
        if (i != 0) {
            i |= -16777216;
        }
        return new C13513c(i, jSONObject.getString("label"));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        return 0;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int m62656h(org.json.JSONArray r10) throws org.json.JSONException, java.lang.NoSuchFieldException {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0004:
            int r4 = r10.length()
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 >= r4) goto L_0x0038
            java.lang.String r4 = r10.getString(r1)
            zb.i$f r4 = p417zb.C13510i.C13516f.m62664a(r4)
            int[] r8 = p417zb.C13510i.C13512b.f47916a
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r7) goto L_0x0030
            if (r4 == r6) goto L_0x002d
            r6 = 3
            if (r4 == r6) goto L_0x002a
            if (r4 == r5) goto L_0x0027
            goto L_0x0032
        L_0x0027:
            r2 = r2 | 8
            goto L_0x0032
        L_0x002a:
            r2 = r2 | 2
            goto L_0x0032
        L_0x002d:
            r2 = r2 | 4
            goto L_0x0032
        L_0x0030:
            r2 = r2 | 1
        L_0x0032:
            if (r3 != 0) goto L_0x0035
            r3 = r2
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0038:
            if (r2 == 0) goto L_0x0057
            r10 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L_0x0056;
                case 3: goto L_0x004d;
                case 4: goto L_0x004c;
                case 5: goto L_0x004a;
                case 6: goto L_0x004d;
                case 7: goto L_0x004d;
                case 8: goto L_0x0049;
                case 9: goto L_0x004d;
                case 10: goto L_0x0046;
                case 11: goto L_0x0045;
                case 12: goto L_0x004d;
                case 13: goto L_0x004d;
                case 14: goto L_0x004d;
                case 15: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0053
        L_0x0042:
            r10 = 13
            return r10
        L_0x0045:
            return r6
        L_0x0046:
            r10 = 11
            return r10
        L_0x0049:
            return r1
        L_0x004a:
            r10 = 12
        L_0x004c:
            return r10
        L_0x004d:
            if (r3 == r6) goto L_0x0056
            if (r3 == r5) goto L_0x0055
            if (r3 == r1) goto L_0x0054
        L_0x0053:
            return r7
        L_0x0054:
            return r1
        L_0x0055:
            return r10
        L_0x0056:
            return r0
        L_0x0057:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p417zb.C13510i.m62656h(org.json.JSONArray):int");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public C13520j m62657i(JSONObject jSONObject) throws JSONException, NoSuchFieldException {
        Boolean bool = null;
        Integer valueOf = !jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null;
        C13514d a = !jSONObject.isNull("statusBarIconBrightness") ? C13514d.m62662a(jSONObject.getString("statusBarIconBrightness")) : null;
        Boolean valueOf2 = !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null;
        Integer valueOf3 = !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null;
        C13514d a2 = !jSONObject.isNull("systemNavigationBarIconBrightness") ? C13514d.m62662a(jSONObject.getString("systemNavigationBarIconBrightness")) : null;
        Integer valueOf4 = !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null;
        if (!jSONObject.isNull("systemNavigationBarContrastEnforced")) {
            bool = Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced"));
        }
        return new C13520j(valueOf, a, valueOf2, valueOf3, a2, valueOf4, bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public C13521k m62658j(String str) throws JSONException, NoSuchFieldException {
        int i = C13512b.f47918c[C13521k.m62680a(str).ordinal()];
        if (i == 1) {
            return C13521k.LEAN_BACK;
        }
        if (i == 2) {
            return C13521k.IMMERSIVE;
        }
        if (i == 3) {
            return C13521k.IMMERSIVE_STICKY;
        }
        if (i != 4) {
            return C13521k.EDGE_TO_EDGE;
        }
        return C13521k.EDGE_TO_EDGE;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public List<C13522l> m62659k(JSONArray jSONArray) throws JSONException, NoSuchFieldException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            int i2 = C13512b.f47917b[C13522l.m62681a(jSONArray.getString(i)).ordinal()];
            if (i2 == 1) {
                arrayList.add(C13522l.TOP_OVERLAYS);
            } else if (i2 == 2) {
                arrayList.add(C13522l.BOTTOM_OVERLAYS);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public void mo38639l(C13518h hVar) {
        this.f47913b = hVar;
    }

    /* renamed from: m */
    public void mo38640m(boolean z) {
        C11881b.m57388f("PlatformChannel", "Sending 'systemUIChange' message.");
        this.f47912a.mo22159c("SystemChrome.systemUIChange", Arrays.asList(new Boolean[]{Boolean.valueOf(z)}));
    }
}
