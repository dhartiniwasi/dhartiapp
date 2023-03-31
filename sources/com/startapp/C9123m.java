package com.startapp;

import android.content.Context;
import com.startapp.C9219p7;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.startapp.m */
/* compiled from: Sta */
public class C9123m {

    /* renamed from: a */
    public final C8908d3<AnalyticsConfig> f37284a;

    public C9123m(Context context, C8908d3<AnalyticsConfig> d3Var) {
        this.f37284a = d3Var;
    }

    /* renamed from: a */
    public void mo29678a(C9141n nVar) {
        long j;
        long j2;
        List list;
        String group;
        C9141n nVar2 = nVar;
        AnalyticsConfig call = this.f37284a.call();
        if (call != null && Math.random() < call.mo30941c()) {
            StringBuilder sb = new StringBuilder();
            boolean z = nVar2.f37317c;
            sb.append("preLoading");
            sb.append('=');
            sb.append(z ? 1 : 0);
            sb.append(", ");
            if (nVar2.f37318d) {
                boolean z2 = nVar2.f37320f;
                sb.append("appPresent");
                sb.append('=');
                sb.append(z2 ? 1 : 0);
                sb.append(", ");
            }
            C9141n.m48980a(sb);
            String sb2 = sb.toString();
            sb.delete(0, sb.length());
            List<String> b = call.mo30940b();
            C9141n.m48981a(sb, "adId", nVar2.f37315a, true);
            long j3 = nVar2.f37316b.f38069e;
            sb.append("start");
            sb.append('=');
            sb.append(j3);
            sb.append(", ");
            Map<String, List<String>> map = nVar2.f37316b.f38068d;
            if (map != null && (list = map.get("Server-Timing")) != null) {
                Pattern pattern = C9141n.f37314m;
                if (pattern == null) {
                    pattern = Pattern.compile("^total;dur=(\\d+(\\.\\d*)?)$");
                    C9141n.f37314m = pattern;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Matcher matcher = pattern.matcher((String) it.next());
                    if (matcher.matches() && (group = matcher.group(1)) != null) {
                        j = (long) (Double.parseDouble(group) * 1000000.0d);
                        break;
                    }
                }
            }
            j = 0;
            if (j > 0) {
                C9141n.m48981a(sb, "serverTotal", C9141n.m48979a(j), false);
            }
            C9219p7.C9220a aVar = nVar2.f37316b;
            String str = sb2;
            C9141n.m48981a(sb, "network", C9141n.m48979a((aVar.f38071g - aVar.f38070f) - j), false);
            long j4 = nVar2.f37321g;
            if (j4 > 0) {
                C9141n.m48981a(sb, "parsing", C9141n.m48979a(j4 - nVar2.f37316b.f38071g), false);
                if (nVar2.f37317c) {
                    long j5 = nVar2.f37322h;
                    if (j5 > 0) {
                        C9141n.m48981a(sb, "beforeLoad", C9141n.m48979a(j5 - nVar2.f37321g), false);
                        if (nVar2.f37319e) {
                            sb.append("preLoadingSkipped");
                            sb.append('=');
                            sb.append(1);
                            sb.append(", ");
                            j2 = nVar2.f37322h;
                        } else {
                            long j6 = nVar2.f37323i;
                            if (j6 > 0) {
                                C9141n.m48981a(sb, "init", C9141n.m48979a(j6 - nVar2.f37322h), false);
                                C9141n.m48981a(sb, "loading", C9141n.m48979a(nVar2.f37324j - nVar2.f37323i), false);
                                boolean z3 = nVar2.f37326l;
                                sb.append("pageFinished");
                                sb.append('=');
                                sb.append(z3 ? 1 : 0);
                                sb.append(", ");
                                j2 = nVar2.f37324j;
                            } else {
                                sb.append("error");
                                sb.append('=');
                                sb.append((long) nVar2.f37325k);
                                sb.append(", ");
                                j2 = nVar2.f37322h;
                            }
                        }
                    }
                }
                j2 = nVar2.f37321g;
            } else {
                j2 = nVar2.f37316b.f38071g;
            }
            C9141n.m48981a(sb, "total", C9141n.m48979a(j2 - nVar2.f37316b.f38070f), false);
            Map<String, List<String>> map2 = nVar2.f37316b.f38068d;
            if (!(map2 == null || b == null)) {
                sb.append("headers");
                sb.append("={");
                for (Map.Entry next : map2.entrySet()) {
                    if (b.contains(next.getKey()) && next.getValue() != null) {
                        sb.append((String) next.getKey());
                        sb.append("=[");
                        for (String a : (List) next.getValue()) {
                            C9141n.m48981a(sb, (String) null, a, true);
                        }
                        C9141n.m48980a(sb);
                        sb.append(']');
                        sb.append(", ");
                    }
                }
                C9141n.m48980a(sb);
                sb.append("}");
                sb.append(", ");
            }
            C9141n.m48980a(sb);
            String sb3 = sb.toString();
            C9023i4 i4Var = new C9023i4(C9043j4.f36993d);
            i4Var.f36952d = "ADM";
            i4Var.f36957i = str;
            i4Var.f36953e = sb3;
            i4Var.mo29471a();
        }
    }
}
