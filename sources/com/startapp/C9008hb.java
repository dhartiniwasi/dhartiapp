package com.startapp;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import com.startapp.C9569td;
import com.startapp.C9588ud;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p213da.C9926a;

/* renamed from: com.startapp.hb */
/* compiled from: Sta */
public class C9008hb implements C9588ud.C9589a {

    /* renamed from: h */
    public static C9008hb f36917h = new C9008hb();

    /* renamed from: i */
    public static Handler f36918i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    public static Handler f36919j = null;

    /* renamed from: k */
    public static final Runnable f36920k = new C9011c();

    /* renamed from: l */
    public static final Runnable f36921l = new C9012d();

    /* renamed from: a */
    public List<C9010b> f36922a = new ArrayList();

    /* renamed from: b */
    public int f36923b;

    /* renamed from: c */
    public final List<C9646xd> f36924c = new ArrayList();

    /* renamed from: d */
    public C8896ce f36925d = new C8896ce();

    /* renamed from: e */
    public C9569td f36926e = new C9569td();

    /* renamed from: f */
    public C9609vd f36927f = new C9609vd(new C9100ke());

    /* renamed from: g */
    public long f36928g;

    /* renamed from: com.startapp.hb$a */
    /* compiled from: Sta */
    public interface C9009a extends C9010b {
        /* renamed from: b */
        void mo29461b(int i, long j);
    }

    /* renamed from: com.startapp.hb$b */
    /* compiled from: Sta */
    public interface C9010b {
        /* renamed from: a */
        void mo29462a(int i, long j);
    }

    /* renamed from: com.startapp.hb$c */
    /* compiled from: Sta */
    public class C9011c implements Runnable {
        public void run() {
            String str;
            Boolean bool;
            C9008hb hbVar = C9008hb.f36917h;
            hbVar.f36923b = 0;
            hbVar.f36924c.clear();
            for (T t : Collections.unmodifiableCollection(C9228pd.f38085c.f38087b)) {
                t.getClass();
            }
            hbVar.f36928g = System.nanoTime();
            C9569td tdVar = hbVar.f36926e;
            tdVar.getClass();
            C9228pd pdVar = C9228pd.f38085c;
            if (pdVar != null) {
                for (T t2 : Collections.unmodifiableCollection(pdVar.f38087b)) {
                    View b = t2.mo29884b();
                    if (t2.mo29885c()) {
                        String str2 = t2.f38171h;
                        if (b != null) {
                            if (Build.VERSION.SDK_INT < 19 || b.isAttachedToWindow()) {
                                if (b.hasWindowFocus()) {
                                    tdVar.f39223h.remove(b);
                                    bool = Boolean.FALSE;
                                } else if (tdVar.f39223h.containsKey(b)) {
                                    bool = tdVar.f39223h.get(b);
                                } else {
                                    Map<View, Boolean> map = tdVar.f39223h;
                                    Boolean bool2 = Boolean.FALSE;
                                    map.put(b, bool2);
                                    bool = bool2;
                                }
                                if (bool.booleanValue()) {
                                    str = "noWindowFocus";
                                } else {
                                    HashSet hashSet = new HashSet();
                                    View view = b;
                                    while (true) {
                                        if (view == null) {
                                            tdVar.f39219d.addAll(hashSet);
                                            str = null;
                                            break;
                                        }
                                        String a = C9610ve.m50486a(view);
                                        if (a != null) {
                                            str = a;
                                            break;
                                        }
                                        hashSet.add(view);
                                        ViewParent parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "notAttached";
                            }
                            if (str == null) {
                                tdVar.f39220e.add(str2);
                                tdVar.f39216a.put(b, str2);
                                for (C9017he next : t2.f38166c) {
                                    View view2 = (View) next.f36936a.get();
                                    if (view2 != null) {
                                        C9569td.C9570a aVar = tdVar.f39217b.get(view2);
                                        if (aVar != null) {
                                            aVar.f39226b.add(t2.f38171h);
                                        } else {
                                            tdVar.f39217b.put(view2, new C9569td.C9570a(next, t2.f38171h));
                                        }
                                    }
                                }
                            } else if (str != "noWindowFocus") {
                                tdVar.f39221f.add(str2);
                                tdVar.f39218c.put(str2, b);
                                tdVar.f39222g.put(str2, str);
                            }
                        } else {
                            tdVar.f39221f.add(str2);
                            tdVar.f39222g.put(str2, "noAdView");
                        }
                    }
                }
            }
            long nanoTime = System.nanoTime();
            C9033ie ieVar = hbVar.f36925d.f36658b;
            if (hbVar.f36926e.f39221f.size() > 0) {
                Iterator<String> it = hbVar.f36926e.f39221f.iterator();
                while (it.hasNext()) {
                    String next2 = it.next();
                    JSONObject a2 = ieVar.mo29495a((View) null);
                    View view3 = hbVar.f36926e.f39218c.get(next2);
                    C9159ne neVar = hbVar.f36925d.f36657a;
                    String str3 = hbVar.f36926e.f39222g.get(next2);
                    if (str3 != null) {
                        JSONObject a3 = neVar.mo29495a(view3);
                        WindowManager windowManager = C8919de.f36706a;
                        try {
                            a3.put("adSessionId", next2);
                        } catch (JSONException e) {
                            Log.e("OMIDLIB", "Error with setting ad session id", e);
                        }
                        try {
                            a3.put("notVisibleReason", str3);
                        } catch (JSONException e2) {
                            Log.e("OMIDLIB", "Error with setting not visible reason", e2);
                        }
                        C8919de.m48530a(a2, a3);
                    }
                    C8919de.m48528a(a2);
                    HashSet hashSet2 = new HashSet();
                    hashSet2.add(next2);
                    C9609vd vdVar = hbVar.f36927f;
                    vdVar.f39322b.mo29632a(new C9571te(vdVar, hashSet2, a2, nanoTime));
                }
            }
            if (hbVar.f36926e.f39220e.size() > 0) {
                JSONObject a4 = ieVar.mo29495a((View) null);
                ieVar.mo29496a((View) null, a4, hbVar, true, false);
                C8919de.m48528a(a4);
                C9609vd vdVar2 = hbVar.f36927f;
                vdVar2.f39322b.mo29632a(new C9627we(vdVar2, hbVar.f36926e.f39220e, a4, nanoTime));
            } else {
                C9609vd vdVar3 = hbVar.f36927f;
                vdVar3.f39322b.mo29632a(new C9204oe(vdVar3));
            }
            C9569td tdVar2 = hbVar.f36926e;
            tdVar2.f39216a.clear();
            tdVar2.f39217b.clear();
            tdVar2.f39218c.clear();
            tdVar2.f39219d.clear();
            tdVar2.f39220e.clear();
            tdVar2.f39221f.clear();
            tdVar2.f39222g.clear();
            tdVar2.f39224i = false;
            long nanoTime2 = System.nanoTime() - hbVar.f36928g;
            if (hbVar.f36922a.size() > 0) {
                for (C9010b next3 : hbVar.f36922a) {
                    next3.mo29462a(hbVar.f36923b, TimeUnit.NANOSECONDS.toMillis(nanoTime2));
                    if (next3 instanceof C9009a) {
                        ((C9009a) next3).mo29461b(hbVar.f36923b, nanoTime2);
                    }
                }
            }
        }
    }

    /* renamed from: com.startapp.hb$d */
    /* compiled from: Sta */
    public class C9012d implements Runnable {
        public void run() {
            Handler handler = C9008hb.f36919j;
            if (handler != null) {
                handler.post(C9008hb.f36920k);
                C9008hb.f36919j.postDelayed(C9008hb.f36921l, 200);
            }
        }
    }

    /* renamed from: a */
    public final void mo29459a(View view, C9588ud udVar, JSONObject jSONObject, C9926a aVar, boolean z) {
        udVar.mo29496a(view, jSONObject, this, aVar == C9926a.PARENT_VIEW, z);
    }

    /* renamed from: a */
    public void mo29460a(View view, C9588ud udVar, JSONObject jSONObject, boolean z) {
        String str;
        boolean z2;
        boolean z3;
        boolean z4;
        if (C9610ve.m50486a(view) == null) {
            C9569td tdVar = this.f36926e;
            C9926a aVar = tdVar.f39219d.contains(view) ? C9926a.PARENT_VIEW : tdVar.f39224i ? C9926a.OBSTRUCTION_VIEW : C9926a.UNDERLYING_VIEW;
            if (aVar != C9926a.UNDERLYING_VIEW) {
                JSONObject a = udVar.mo29495a(view);
                C8919de.m48530a(jSONObject, a);
                C9569td tdVar2 = this.f36926e;
                if (tdVar2.f39216a.size() == 0) {
                    str = null;
                } else {
                    String str2 = tdVar2.f39216a.get(view);
                    if (str2 != null) {
                        tdVar2.f39216a.remove(view);
                    }
                    str = str2;
                }
                if (str != null) {
                    WindowManager windowManager = C8919de.f36706a;
                    try {
                        a.put("adSessionId", str);
                    } catch (JSONException e) {
                        Log.e("OMIDLIB", "Error with setting ad session id", e);
                    }
                    C9569td tdVar3 = this.f36926e;
                    if (tdVar3.f39223h.containsKey(view)) {
                        tdVar3.f39223h.put(view, Boolean.TRUE);
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    try {
                        a.put("hasWindowFocus", Boolean.valueOf(z4));
                    } catch (JSONException e2) {
                        Log.e("OMIDLIB", "Error with setting not visible reason", e2);
                    }
                    this.f36926e.f39224i = true;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    C9569td tdVar4 = this.f36926e;
                    C9569td.C9570a aVar2 = tdVar4.f39217b.get(view);
                    if (aVar2 != null) {
                        tdVar4.f39217b.remove(view);
                    }
                    if (aVar2 != null) {
                        WindowManager windowManager2 = C8919de.f36706a;
                        C9017he heVar = aVar2.f39225a;
                        JSONArray jSONArray = new JSONArray();
                        for (String put : aVar2.f39226b) {
                            jSONArray.put(put);
                        }
                        try {
                            a.put("isFriendlyObstructionFor", jSONArray);
                            a.put("friendlyObstructionClass", heVar.f36937b);
                            a.put("friendlyObstructionPurpose", heVar.f36938c);
                            a.put("friendlyObstructionReason", heVar.f36939d);
                        } catch (JSONException e3) {
                            Log.e("OMIDLIB", "Error with setting friendly obstruction", e3);
                        }
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    mo29459a(view, udVar, a, aVar, z || z3);
                }
                this.f36923b++;
            }
        }
    }

    /* renamed from: a */
    public void mo29458a() {
        if (f36919j == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f36919j = handler;
            handler.post(f36920k);
            f36919j.postDelayed(f36921l, 200);
        }
    }
}
