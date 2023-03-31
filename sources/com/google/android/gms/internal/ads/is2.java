package com.google.android.gms.internal.ads;

import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.List;
import org.json.JSONObject;
import p060h4.C4583s4;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class is2 {

    /* renamed from: A */
    public final String f10942A;

    /* renamed from: B */
    public final kj0 f10943B;

    /* renamed from: C */
    public final String f10944C;

    /* renamed from: D */
    public final JSONObject f10945D;

    /* renamed from: E */
    public final JSONObject f10946E;

    /* renamed from: F */
    public final String f10947F;

    /* renamed from: G */
    public final String f10948G;

    /* renamed from: H */
    public final String f10949H;

    /* renamed from: I */
    public final String f10950I;

    /* renamed from: J */
    public final String f10951J;

    /* renamed from: K */
    public final boolean f10952K;

    /* renamed from: L */
    public final boolean f10953L;

    /* renamed from: M */
    public final boolean f10954M;

    /* renamed from: N */
    public final boolean f10955N;

    /* renamed from: O */
    public final boolean f10956O;

    /* renamed from: P */
    public final boolean f10957P;

    /* renamed from: Q */
    public final boolean f10958Q;

    /* renamed from: R */
    public final int f10959R;

    /* renamed from: S */
    public final int f10960S;

    /* renamed from: T */
    public final boolean f10961T;

    /* renamed from: U */
    public final boolean f10962U;

    /* renamed from: V */
    public final String f10963V;

    /* renamed from: W */
    public final ht2 f10964W;

    /* renamed from: X */
    public final boolean f10965X;

    /* renamed from: Y */
    public final boolean f10966Y;

    /* renamed from: Z */
    public final int f10967Z;

    /* renamed from: a */
    public final List f10968a;

    /* renamed from: a0 */
    public final String f10969a0;

    /* renamed from: b */
    public final int f10970b;

    /* renamed from: b0 */
    public final int f10971b0;

    /* renamed from: c */
    public final List f10972c;

    /* renamed from: c0 */
    public final String f10973c0;

    /* renamed from: d */
    public final List f10974d;

    /* renamed from: d0 */
    public final boolean f10975d0;

    /* renamed from: e */
    public final List f10976e;

    /* renamed from: e0 */
    public final hf0 f10977e0;

    /* renamed from: f */
    public final int f10978f;

    /* renamed from: f0 */
    public final boolean f10979f0;

    /* renamed from: g */
    public final List f10980g;

    /* renamed from: g0 */
    public final C4583s4 f10981g0;

    /* renamed from: h */
    public final List f10982h;

    /* renamed from: h0 */
    public final String f10983h0;

    /* renamed from: i */
    public final List f10984i;

    /* renamed from: i0 */
    public final boolean f10985i0;

    /* renamed from: j */
    public final List f10986j;

    /* renamed from: j0 */
    public final JSONObject f10987j0;

    /* renamed from: k */
    public final String f10988k;

    /* renamed from: k0 */
    public final boolean f10989k0;

    /* renamed from: l */
    public final String f10990l;

    /* renamed from: l0 */
    public final JSONObject f10991l0;

    /* renamed from: m */
    public final bi0 f10992m;

    /* renamed from: m0 */
    public final boolean f10993m0;

    /* renamed from: n */
    public final List f10994n;

    /* renamed from: n0 */
    public final String f10995n0;

    /* renamed from: o */
    public final List f10996o;

    /* renamed from: o0 */
    public final boolean f10997o0;

    /* renamed from: p */
    public final List f10998p;

    /* renamed from: p0 */
    public final String f10999p0;

    /* renamed from: q */
    public final List f11000q;

    /* renamed from: r */
    public final int f11001r;

    /* renamed from: s */
    public final List f11002s;

    /* renamed from: t */
    public final ns2 f11003t;

    /* renamed from: u */
    public final List f11004u;

    /* renamed from: v */
    public final List f11005v;

    /* renamed from: w */
    public final JSONObject f11006w;

    /* renamed from: x */
    public final String f11007x;

    /* renamed from: y */
    public final String f11008y;

    /* renamed from: z */
    public final String f11009z;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    is2(android.util.JsonReader r77) throws java.lang.IllegalStateException, java.io.IOException, org.json.JSONException, java.lang.NumberFormatException {
        /*
            r76 = this;
            r0 = r76
            r76.<init>()
            java.util.List r1 = java.util.Collections.emptyList()
            java.util.List r2 = java.util.Collections.emptyList()
            java.util.List r3 = java.util.Collections.emptyList()
            java.util.List r4 = java.util.Collections.emptyList()
            java.util.List r5 = java.util.Collections.emptyList()
            java.util.List r6 = java.util.Collections.emptyList()
            java.util.List r7 = java.util.Collections.emptyList()
            java.util.List r8 = java.util.Collections.emptyList()
            java.util.List r9 = java.util.Collections.emptyList()
            java.util.List r10 = java.util.Collections.emptyList()
            java.util.List r11 = java.util.Collections.emptyList()
            java.util.List r12 = java.util.Collections.emptyList()
            java.util.List r13 = java.util.Collections.emptyList()
            java.util.List r14 = java.util.Collections.emptyList()
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>()
            org.json.JSONObject r16 = new org.json.JSONObject
            r16.<init>()
            org.json.JSONObject r17 = new org.json.JSONObject
            r17.<init>()
            org.json.JSONObject r18 = new org.json.JSONObject
            r18.<init>()
            org.json.JSONObject r19 = new org.json.JSONObject
            r19.<init>()
            org.json.JSONObject r20 = new org.json.JSONObject
            r20.<init>()
            com.google.android.gms.internal.ads.ua3 r21 = com.google.android.gms.internal.ads.ua3.m21508w()
            r77.beginObject()
            r22 = 1
            r23 = -1
            r24 = 0
            java.lang.String r25 = ""
            r26 = 0
            r27 = r16
            r28 = r17
            r29 = r18
            r30 = r19
            r31 = r20
            r32 = r21
            r19 = r24
            r33 = r19
            r34 = r33
            r35 = r34
            r36 = r35
            r38 = r25
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
            r53 = r42
            r57 = r53
            r59 = r57
            r62 = r59
            r64 = r62
            r65 = r64
            r66 = r65
            r67 = r66
            r68 = r67
            r73 = r68
            r37 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = -1
            r51 = 0
            r52 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r58 = -1
            r60 = 0
            r61 = 1
            r63 = 0
            r69 = 0
            r70 = 0
            r71 = 0
            r72 = 0
            r21 = r11
            r20 = r12
            r18 = r13
            r17 = r14
            r16 = r15
            r15 = r36
            r11 = r73
            r12 = r11
            r13 = 0
            r14 = 0
        L_0x00dd:
            boolean r24 = r77.hasNext()
            if (r24 == 0) goto L_0x081a
            java.lang.String r24 = r77.nextName()
            if (r24 != 0) goto L_0x00ec
            r74 = r25
            goto L_0x00ee
        L_0x00ec:
            r74 = r24
        L_0x00ee:
            int r24 = r74.hashCode()
            switch(r24) {
                case -2138196627: goto L_0x05a4;
                case -1980587809: goto L_0x0593;
                case -1965512151: goto L_0x0582;
                case -1812055556: goto L_0x0571;
                case -1776946669: goto L_0x0560;
                case -1662989631: goto L_0x054f;
                case -1620470467: goto L_0x053d;
                case -1550155393: goto L_0x052b;
                case -1440104884: goto L_0x0519;
                case -1439500848: goto L_0x0507;
                case -1428969291: goto L_0x04f5;
                case -1406227629: goto L_0x04e3;
                case -1403779768: goto L_0x04d1;
                case -1375413093: goto L_0x04bf;
                case -1360811658: goto L_0x04ad;
                case -1306015996: goto L_0x049b;
                case -1303332046: goto L_0x0489;
                case -1289032093: goto L_0x0477;
                case -1240082064: goto L_0x0465;
                case -1234181075: goto L_0x0453;
                case -1168140544: goto L_0x0441;
                case -1152230954: goto L_0x0430;
                case -1146534047: goto L_0x041e;
                case -1115838944: goto L_0x040c;
                case -1081936678: goto L_0x03fa;
                case -1078050970: goto L_0x03e8;
                case -1051269058: goto L_0x03d6;
                case -982608540: goto L_0x03c4;
                case -972056451: goto L_0x03b2;
                case -776859333: goto L_0x03a1;
                case -544216775: goto L_0x038f;
                case -437057161: goto L_0x037e;
                case -404433734: goto L_0x036c;
                case -404326515: goto L_0x035a;
                case -397704715: goto L_0x0348;
                case -388807511: goto L_0x0336;
                case -369773488: goto L_0x0324;
                case -213449460: goto L_0x0312;
                case -213424028: goto L_0x0300;
                case -180214626: goto L_0x02ee;
                case -154616268: goto L_0x02dc;
                case -29338502: goto L_0x02ca;
                case 3107: goto L_0x02b8;
                case 3355: goto L_0x02a6;
                case 3076010: goto L_0x0294;
                case 37109963: goto L_0x0282;
                case 63195984: goto L_0x0270;
                case 107433883: goto L_0x025e;
                case 230323073: goto L_0x024d;
                case 418392395: goto L_0x023b;
                case 549176928: goto L_0x0229;
                case 597473788: goto L_0x0217;
                case 754887508: goto L_0x0205;
                case 791122864: goto L_0x01f4;
                case 1010584092: goto L_0x01e2;
                case 1100650276: goto L_0x01d0;
                case 1186014765: goto L_0x01be;
                case 1321720943: goto L_0x01ac;
                case 1437255331: goto L_0x019a;
                case 1637553475: goto L_0x0188;
                case 1638957285: goto L_0x0177;
                case 1686319423: goto L_0x0165;
                case 1688341040: goto L_0x0154;
                case 1799285870: goto L_0x0142;
                case 1839650832: goto L_0x0131;
                case 1875425491: goto L_0x011f;
                case 2068142375: goto L_0x010d;
                case 2072888499: goto L_0x00fb;
                default: goto L_0x00f5;
            }
        L_0x00f5:
            r75 = r9
            r24 = r10
            goto L_0x05b5
        L_0x00fb:
            r24 = r10
            java.lang.String r10 = "manual_tracking_urls"
            r75 = r9
            r9 = r74
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 15
            goto L_0x05b6
        L_0x010d:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "rule_line_external_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 52
            goto L_0x05b6
        L_0x011f:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "is_analytics_logging_enabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 42
            goto L_0x05b6
        L_0x0131:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "renderers"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 0
            goto L_0x05b6
        L_0x0142:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "use_third_party_container_height"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 48
            goto L_0x05b6
        L_0x0154:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "video_reward_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 7
            goto L_0x05b6
        L_0x0165:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad_network_class_name"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 55
            goto L_0x05b6
        L_0x0177:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "video_start_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 6
            goto L_0x05b6
        L_0x0188:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "bid_response"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 40
            goto L_0x05b6
        L_0x019a:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad_source_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 57
            goto L_0x05b6
        L_0x01ac:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "allow_pub_owned_ad_view"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 31
            goto L_0x05b6
        L_0x01be:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "cache_hit_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 65
            goto L_0x05b6
        L_0x01d0:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "rewards"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 11
            goto L_0x05b6
        L_0x01e2:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "transaction_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 9
            goto L_0x05b6
        L_0x01f4:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "impression_type"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 5
            goto L_0x05b6
        L_0x0205:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "container_sizes"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 17
            goto L_0x05b6
        L_0x0217:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "debug_dialog_string"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 27
            goto L_0x05b6
        L_0x0229:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "presentation_error_timeout_ms"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 16
            goto L_0x05b6
        L_0x023b:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "is_closable_area_disabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 36
            goto L_0x05b6
        L_0x024d:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad_load_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 4
            goto L_0x05b6
        L_0x025e:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "qdata"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 24
            goto L_0x05b6
        L_0x0270:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "render_test_label"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 33
            goto L_0x05b6
        L_0x0282:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "request_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 67
            goto L_0x05b6
        L_0x0294:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "data"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 22
            goto L_0x05b6
        L_0x02a6:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 23
            goto L_0x05b6
        L_0x02b8:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 18
            goto L_0x05b6
        L_0x02ca:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "allow_custom_click_gesture"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 32
            goto L_0x05b6
        L_0x02dc:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "is_offline_ad"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 60
            goto L_0x05b6
        L_0x02ee:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "native_required_asset_viewability"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 62
            goto L_0x05b6
        L_0x0300:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "watermark"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 46
            goto L_0x05b6
        L_0x0312:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "force_disable_hardware_acceleration"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 64
            goto L_0x05b6
        L_0x0324:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "is_close_button_enabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 50
            goto L_0x05b6
        L_0x0336:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "content_url"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 63
            goto L_0x05b6
        L_0x0348:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad_close_time_ms"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 45
            goto L_0x05b6
        L_0x035a:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "render_timeout_ms"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 38
            goto L_0x05b6
        L_0x036c:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "rtb_native_required_assets"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 61
            goto L_0x05b6
        L_0x037e:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "imp_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 3
            goto L_0x05b6
        L_0x038f:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "safe_browsing"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 26
            goto L_0x05b6
        L_0x03a1:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "click_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 2
            goto L_0x05b6
        L_0x03b2:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad_source_instance_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 59
            goto L_0x05b6
        L_0x03c4:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "valid_from_timestamp"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 10
            goto L_0x05b6
        L_0x03d6:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "active_view"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 25
            goto L_0x05b6
        L_0x03e8:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "video_complete_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 8
            goto L_0x05b6
        L_0x03fa:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "allocation_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 21
            goto L_0x05b6
        L_0x040c:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "fill_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 12
            goto L_0x05b6
        L_0x041e:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "is_scroll_aware"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 43
            goto L_0x05b6
        L_0x0430:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad_type"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 1
            goto L_0x05b6
        L_0x0441:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "presentation_error_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 14
            goto L_0x05b6
        L_0x0453:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "allow_pub_rendered_attribution"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 30
            goto L_0x05b6
        L_0x0465:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad_event_value"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 51
            goto L_0x05b6
        L_0x0477:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "extras"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 29
            goto L_0x05b6
        L_0x0489:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "test_mode_enabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 34
            goto L_0x05b6
        L_0x049b:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "adapters"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 20
            goto L_0x05b6
        L_0x04ad:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad_sizes"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 19
            goto L_0x05b6
        L_0x04bf:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad_cover"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 54
            goto L_0x05b6
        L_0x04d1:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "showable_impression_type"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 44
            goto L_0x05b6
        L_0x04e3:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "buffer_click_url_as_ready_to_ping"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 66
            goto L_0x05b6
        L_0x04f5:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "enable_omid"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 39
            goto L_0x05b6
        L_0x0507:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "orientation"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 37
            goto L_0x05b6
        L_0x0519:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "is_custom_close_blocked"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 35
            goto L_0x05b6
        L_0x052b:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "nofill_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 13
            goto L_0x05b6
        L_0x053d:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "backend_query_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 47
            goto L_0x05b6
        L_0x054f:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "is_interscroller"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 53
            goto L_0x05b6
        L_0x0560:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad_source_name"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 56
            goto L_0x05b6
        L_0x0571:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "play_prewarm_options"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 49
            goto L_0x05b6
        L_0x0582:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "omid_settings"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 41
            goto L_0x05b6
        L_0x0593:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "debug_signals"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 28
            goto L_0x05b6
        L_0x05a4:
            r75 = r9
            r24 = r10
            r9 = r74
            java.lang.String r10 = "ad_source_instance_name"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b5
            r9 = 58
            goto L_0x05b6
        L_0x05b5:
            r9 = -1
        L_0x05b6:
            switch(r9) {
                case 0: goto L_0x080e;
                case 1: goto L_0x0803;
                case 2: goto L_0x07fc;
                case 3: goto L_0x07f5;
                case 4: goto L_0x07ee;
                case 5: goto L_0x07e3;
                case 6: goto L_0x07dc;
                case 7: goto L_0x07d5;
                case 8: goto L_0x07ce;
                case 9: goto L_0x07c7;
                case 10: goto L_0x07c0;
                case 11: goto L_0x07b4;
                case 12: goto L_0x07ac;
                case 13: goto L_0x07a4;
                case 14: goto L_0x079a;
                case 15: goto L_0x0790;
                case 16: goto L_0x0788;
                case 17: goto L_0x077e;
                case 18: goto L_0x0773;
                case 19: goto L_0x0769;
                case 20: goto L_0x075f;
                case 21: goto L_0x0757;
                case 22: goto L_0x074d;
                case 23: goto L_0x0748;
                case 24: goto L_0x0743;
                case 25: goto L_0x073a;
                case 26: goto L_0x072c;
                case 27: goto L_0x0727;
                case 28: goto L_0x071d;
                case 29: goto L_0x0713;
                case 30: goto L_0x070e;
                case 31: goto L_0x0709;
                case 32: goto L_0x0704;
                case 33: goto L_0x06ff;
                case 34: goto L_0x06fa;
                case 35: goto L_0x06f4;
                case 36: goto L_0x06ee;
                case 37: goto L_0x06e4;
                case 38: goto L_0x06de;
                case 39: goto L_0x06d8;
                case 40: goto L_0x06d2;
                case 41: goto L_0x06c8;
                case 42: goto L_0x06c2;
                case 43: goto L_0x06bc;
                case 44: goto L_0x06b6;
                case 45: goto L_0x06b0;
                case 46: goto L_0x06aa;
                case 47: goto L_0x06a4;
                case 48: goto L_0x069e;
                case 49: goto L_0x0690;
                case 50: goto L_0x068a;
                case 51: goto L_0x067c;
                case 52: goto L_0x0676;
                case 53: goto L_0x0670;
                case 54: goto L_0x0666;
                case 55: goto L_0x0660;
                case 56: goto L_0x0647;
                case 57: goto L_0x062e;
                case 58: goto L_0x0615;
                case 59: goto L_0x05fc;
                case 60: goto L_0x05f6;
                case 61: goto L_0x05ec;
                case 62: goto L_0x05e6;
                case 63: goto L_0x05dc;
                case 64: goto L_0x05d6;
                case 65: goto L_0x05cc;
                case 66: goto L_0x05c6;
                case 67: goto L_0x05c0;
                default: goto L_0x05b9;
            }
        L_0x05b9:
            r10 = r77
            r77.skipValue()
            goto L_0x0814
        L_0x05c0:
            java.lang.String r73 = r77.nextString()
            goto L_0x075b
        L_0x05c6:
            boolean r72 = r77.nextBoolean()
            goto L_0x075b
        L_0x05cc:
            java.util.List r9 = p073j4.C4820w0.m30814d(r77)
            r10 = r77
            r32 = r9
            goto L_0x0814
        L_0x05d6:
            boolean r71 = r77.nextBoolean()
            goto L_0x075b
        L_0x05dc:
            java.lang.String r9 = r77.nextString()
            r10 = r77
            r36 = r9
            goto L_0x0814
        L_0x05e6:
            boolean r70 = r77.nextBoolean()
            goto L_0x075b
        L_0x05ec:
            org.json.JSONObject r9 = p073j4.C4820w0.m30818h(r77)
            r10 = r77
            r31 = r9
            goto L_0x0814
        L_0x05f6:
            boolean r69 = r77.nextBoolean()
            goto L_0x075b
        L_0x05fc:
            com.google.android.gms.internal.ads.ez r9 = com.google.android.gms.internal.ads.C2679nz.f14418R5
            java.lang.Object r9 = r9.mo10050l()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0610
            java.lang.String r68 = r77.nextString()
            goto L_0x075b
        L_0x0610:
            r77.skipValue()
            goto L_0x075b
        L_0x0615:
            com.google.android.gms.internal.ads.ez r9 = com.google.android.gms.internal.ads.C2679nz.f14418R5
            java.lang.Object r9 = r9.mo10050l()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0629
            java.lang.String r67 = r77.nextString()
            goto L_0x075b
        L_0x0629:
            r77.skipValue()
            goto L_0x075b
        L_0x062e:
            com.google.android.gms.internal.ads.ez r9 = com.google.android.gms.internal.ads.C2679nz.f14418R5
            java.lang.Object r9 = r9.mo10050l()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0642
            java.lang.String r66 = r77.nextString()
            goto L_0x075b
        L_0x0642:
            r77.skipValue()
            goto L_0x075b
        L_0x0647:
            com.google.android.gms.internal.ads.ez r9 = com.google.android.gms.internal.ads.C2679nz.f14418R5
            java.lang.Object r9 = r9.mo10050l()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x065b
            java.lang.String r65 = r77.nextString()
            goto L_0x075b
        L_0x065b:
            r77.skipValue()
            goto L_0x075b
        L_0x0660:
            java.lang.String r64 = r77.nextString()
            goto L_0x075b
        L_0x0666:
            org.json.JSONObject r9 = p073j4.C4820w0.m30818h(r77)
            r10 = r77
            r30 = r9
            goto L_0x0814
        L_0x0670:
            boolean r63 = r77.nextBoolean()
            goto L_0x075b
        L_0x0676:
            java.lang.String r62 = r77.nextString()
            goto L_0x075b
        L_0x067c:
            org.json.JSONObject r9 = p073j4.C4820w0.m30818h(r77)
            h4.s4 r9 = p060h4.C4583s4.m30034I1(r9)
            r10 = r77
            r35 = r9
            goto L_0x0814
        L_0x068a:
            boolean r61 = r77.nextBoolean()
            goto L_0x075b
        L_0x0690:
            org.json.JSONObject r9 = p073j4.C4820w0.m30818h(r77)
            com.google.android.gms.internal.ads.hf0 r9 = com.google.android.gms.internal.ads.hf0.m13827a(r9)
            r10 = r77
            r34 = r9
            goto L_0x0814
        L_0x069e:
            boolean r60 = r77.nextBoolean()
            goto L_0x075b
        L_0x06a4:
            java.lang.String r59 = r77.nextString()
            goto L_0x075b
        L_0x06aa:
            java.lang.String r57 = r77.nextString()
            goto L_0x075b
        L_0x06b0:
            int r58 = r77.nextInt()
            goto L_0x075b
        L_0x06b6:
            int r56 = r77.nextInt()
            goto L_0x075b
        L_0x06bc:
            boolean r55 = r77.nextBoolean()
            goto L_0x075b
        L_0x06c2:
            boolean r54 = r77.nextBoolean()
            goto L_0x075b
        L_0x06c8:
            org.json.JSONObject r9 = p073j4.C4820w0.m30818h(r77)
            r10 = r77
            r29 = r9
            goto L_0x0814
        L_0x06d2:
            java.lang.String r53 = r77.nextString()
            goto L_0x075b
        L_0x06d8:
            boolean r52 = r77.nextBoolean()
            goto L_0x075b
        L_0x06de:
            int r51 = r77.nextInt()
            goto L_0x075b
        L_0x06e4:
            java.lang.String r9 = r77.nextString()
            int r50 = m14544d(r9)
            goto L_0x075b
        L_0x06ee:
            boolean r49 = r77.nextBoolean()
            goto L_0x075b
        L_0x06f4:
            boolean r48 = r77.nextBoolean()
            goto L_0x075b
        L_0x06fa:
            boolean r47 = r77.nextBoolean()
            goto L_0x075b
        L_0x06ff:
            boolean r46 = r77.nextBoolean()
            goto L_0x075b
        L_0x0704:
            boolean r45 = r77.nextBoolean()
            goto L_0x075b
        L_0x0709:
            boolean r44 = r77.nextBoolean()
            goto L_0x075b
        L_0x070e:
            boolean r43 = r77.nextBoolean()
            goto L_0x075b
        L_0x0713:
            org.json.JSONObject r9 = p073j4.C4820w0.m30818h(r77)
            r10 = r77
            r28 = r9
            goto L_0x0814
        L_0x071d:
            org.json.JSONObject r9 = p073j4.C4820w0.m30818h(r77)
            r10 = r77
            r27 = r9
            goto L_0x0814
        L_0x0727:
            java.lang.String r42 = r77.nextString()
            goto L_0x075b
        L_0x072c:
            org.json.JSONObject r9 = p073j4.C4820w0.m30818h(r77)
            com.google.android.gms.internal.ads.kj0 r9 = com.google.android.gms.internal.ads.kj0.m15441I1(r9)
            r10 = r77
            r33 = r9
            goto L_0x0814
        L_0x073a:
            org.json.JSONObject r9 = p073j4.C4820w0.m30818h(r77)
            java.lang.String r41 = r9.toString()
            goto L_0x075b
        L_0x0743:
            java.lang.String r40 = r77.nextString()
            goto L_0x075b
        L_0x0748:
            java.lang.String r39 = r77.nextString()
            goto L_0x075b
        L_0x074d:
            org.json.JSONObject r9 = p073j4.C4820w0.m30818h(r77)
            r10 = r77
            r16 = r9
            goto L_0x0814
        L_0x0757:
            java.lang.String r38 = r77.nextString()
        L_0x075b:
            r10 = r77
            goto L_0x0814
        L_0x075f:
            java.util.List r9 = p073j4.C4820w0.m30814d(r77)
            r10 = r77
            r18 = r9
            goto L_0x0814
        L_0x0769:
            java.util.List r9 = com.google.android.gms.internal.ads.js2.m15057a(r77)
            r10 = r77
            r17 = r9
            goto L_0x0814
        L_0x0773:
            com.google.android.gms.internal.ads.ns2 r9 = new com.google.android.gms.internal.ads.ns2
            r10 = r77
            r9.<init>(r10)
            r19 = r9
            goto L_0x0814
        L_0x077e:
            r10 = r77
            java.util.List r9 = com.google.android.gms.internal.ads.js2.m15057a(r77)
            r20 = r9
            goto L_0x0814
        L_0x0788:
            r10 = r77
            int r37 = r77.nextInt()
            goto L_0x0814
        L_0x0790:
            r10 = r77
            java.util.List r9 = p073j4.C4820w0.m30814d(r77)
            r21 = r9
            goto L_0x0814
        L_0x079a:
            r10 = r77
            java.util.List r9 = p073j4.C4820w0.m30814d(r77)
            r24 = r9
            goto L_0x0814
        L_0x07a4:
            r10 = r77
            java.util.List r9 = p073j4.C4820w0.m30814d(r77)
            goto L_0x0816
        L_0x07ac:
            r10 = r77
            java.util.List r8 = p073j4.C4820w0.m30814d(r77)
            goto L_0x0814
        L_0x07b4:
            r10 = r77
            org.json.JSONArray r9 = p073j4.C4820w0.m30815e(r77)
            com.google.android.gms.internal.ads.bi0 r9 = com.google.android.gms.internal.ads.bi0.m10388I1(r9)
            r15 = r9
            goto L_0x0814
        L_0x07c0:
            r10 = r77
            java.lang.String r11 = r77.nextString()
            goto L_0x0814
        L_0x07c7:
            r10 = r77
            java.lang.String r12 = r77.nextString()
            goto L_0x0814
        L_0x07ce:
            r10 = r77
            java.util.List r7 = p073j4.C4820w0.m30814d(r77)
            goto L_0x0814
        L_0x07d5:
            r10 = r77
            java.util.List r6 = p073j4.C4820w0.m30814d(r77)
            goto L_0x0814
        L_0x07dc:
            r10 = r77
            java.util.List r5 = p073j4.C4820w0.m30814d(r77)
            goto L_0x0814
        L_0x07e3:
            r10 = r77
            int r9 = r77.nextInt()
            int r14 = m14543c(r9)
            goto L_0x0814
        L_0x07ee:
            r10 = r77
            java.util.List r4 = p073j4.C4820w0.m30814d(r77)
            goto L_0x0814
        L_0x07f5:
            r10 = r77
            java.util.List r3 = p073j4.C4820w0.m30814d(r77)
            goto L_0x0814
        L_0x07fc:
            r10 = r77
            java.util.List r2 = p073j4.C4820w0.m30814d(r77)
            goto L_0x0814
        L_0x0803:
            r10 = r77
            java.lang.String r9 = r77.nextString()
            int r13 = m14542b(r9)
            goto L_0x0814
        L_0x080e:
            r10 = r77
            java.util.List r1 = p073j4.C4820w0.m30814d(r77)
        L_0x0814:
            r9 = r75
        L_0x0816:
            r10 = r24
            goto L_0x00dd
        L_0x081a:
            r75 = r9
            r24 = r10
            r10 = r77
            r77.endObject()
            r0.f10968a = r1
            r0.f10970b = r13
            r0.f10972c = r2
            r0.f10974d = r3
            r0.f10980g = r4
            r0.f10978f = r14
            r0.f10982h = r5
            r0.f10984i = r6
            r0.f10986j = r7
            r0.f10988k = r12
            r0.f10990l = r11
            r0.f10992m = r15
            r0.f10994n = r8
            r0.f10996o = r9
            r10 = r24
            r0.f10998p = r10
            r11 = r21
            r0.f11000q = r11
            r1 = r37
            r0.f11001r = r1
            r12 = r20
            r0.f11002s = r12
            r1 = r19
            r0.f11003t = r1
            r13 = r18
            r0.f11004u = r13
            r14 = r17
            r0.f11005v = r14
            r1 = r38
            r0.f11007x = r1
            r15 = r16
            r0.f11006w = r15
            r1 = r39
            r0.f11008y = r1
            r1 = r40
            r0.f11009z = r1
            r1 = r41
            r0.f10942A = r1
            r1 = r33
            r0.f10943B = r1
            r1 = r42
            r0.f10944C = r1
            r1 = r27
            r0.f10945D = r1
            r1 = r28
            r0.f10946E = r1
            r1 = r43
            r0.f10952K = r1
            r1 = r44
            r0.f10953L = r1
            r1 = r45
            r0.f10954M = r1
            r1 = r46
            r0.f10955N = r1
            r1 = r47
            r0.f10956O = r1
            r1 = r48
            r0.f10957P = r1
            r1 = r49
            r0.f10958Q = r1
            r1 = r50
            r0.f10959R = r1
            r1 = r51
            r0.f10960S = r1
            r1 = r52
            r0.f10962U = r1
            r1 = r53
            r0.f10963V = r1
            com.google.android.gms.internal.ads.ht2 r1 = new com.google.android.gms.internal.ads.ht2
            r2 = r29
            r1.<init>(r2)
            r0.f10964W = r1
            r1 = r54
            r0.f10965X = r1
            r1 = r55
            r0.f10966Y = r1
            r1 = r56
            r0.f10967Z = r1
            r1 = r57
            r0.f10969a0 = r1
            r1 = r58
            r0.f10971b0 = r1
            r1 = r59
            r0.f10973c0 = r1
            r1 = r60
            r0.f10975d0 = r1
            r1 = r34
            r0.f10977e0 = r1
            r1 = r61
            r0.f10979f0 = r1
            r1 = r35
            r0.f10981g0 = r1
            r1 = r62
            r0.f10983h0 = r1
            r1 = r63
            r0.f10985i0 = r1
            r1 = r30
            r0.f10987j0 = r1
            r1 = r64
            r0.f10947F = r1
            r1 = r65
            r0.f10948G = r1
            r1 = r66
            r0.f10949H = r1
            r1 = r67
            r0.f10950I = r1
            r1 = r68
            r0.f10951J = r1
            r1 = r69
            r0.f10989k0 = r1
            r1 = r31
            r0.f10991l0 = r1
            r1 = r70
            r0.f10993m0 = r1
            r1 = r36
            r0.f10995n0 = r1
            r1 = r71
            r0.f10997o0 = r1
            r1 = r32
            r0.f10976e = r1
            r1 = r72
            r0.f10961T = r1
            r1 = r73
            r0.f10999p0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.is2.<init>(android.util.JsonReader):void");
    }

    /* renamed from: a */
    public static String m14541a(int i) {
        switch (i) {
            case 1:
                return AdPreferences.TYPE_BANNER;
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: b */
    private static int m14542b(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str) || "app_open_ad_v2".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    /* renamed from: c */
    private static int m14543c(int i) {
        if (i == 0 || i == 1) {
            return i;
        }
        return 0;
    }

    /* renamed from: d */
    private static final int m14544d(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }
}
