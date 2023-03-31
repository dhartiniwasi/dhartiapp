package p144t5;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Executor;
import p403y6.C13049a;
import p403y6.C13053c;
import p403y6.C13056d;

/* renamed from: t5.g2 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
final class C5554g2 {

    /* renamed from: a */
    private final Application f28094a;

    /* renamed from: b */
    private final C5539d f28095b;

    /* renamed from: c */
    private final Handler f28096c;

    /* renamed from: d */
    private final Executor f28097d;

    /* renamed from: e */
    private final C5577n f28098e;

    /* renamed from: f */
    private final C5536c0 f28099f;

    /* renamed from: g */
    private final C5612y1 f28100g;

    /* renamed from: h */
    private final C5570k2 f28101h;

    /* renamed from: i */
    private final C5594s1 f28102i;

    C5554g2(Application application, C5539d dVar, Handler handler, Executor executor, C5577n nVar, C5536c0 c0Var, C5612y1 y1Var, C5570k2 k2Var, C5594s1 s1Var) {
        this.f28094a = application;
        this.f28095b = dVar;
        this.f28096c = handler;
        this.f28097d = executor;
        this.f28098e = nVar;
        this.f28099f = c0Var;
        this.f28100g = y1Var;
        this.f28101h = k2Var;
        this.f28102i = s1Var;
    }

    /* renamed from: d */
    private final C5611y0 m33608d(C5605w0 w0Var) throws C5600u1 {
        String str;
        JsonWriter jsonWriter;
        JsonReader jsonReader;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            Application application = this.f28094a;
            if (Build.VERSION.SDK_INT >= 17) {
                str = WebSettings.getDefaultUserAgent(application);
            } else {
                str = new WebView(application).getSettings().getUserAgentString();
            }
            httpURLConnection.setRequestProperty("User-Agent", str);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                jsonWriter = new JsonWriter(outputStreamWriter);
                jsonWriter.beginObject();
                String str2 = w0Var.f28222a;
                if (str2 != null) {
                    jsonWriter.name("admob_app_id");
                    jsonWriter.value(str2);
                }
                Boolean bool = w0Var.f28223b;
                if (bool != null) {
                    jsonWriter.name("is_lat");
                    jsonWriter.value(bool.booleanValue());
                }
                String str3 = w0Var.f28224c;
                if (str3 != null) {
                    jsonWriter.name("adid");
                    jsonWriter.value(str3);
                }
                C5593s0 s0Var = w0Var.f28225d;
                if (s0Var != null) {
                    jsonWriter.name("device_info");
                    jsonWriter.beginObject();
                    int i = s0Var.f28205c;
                    if (i != 1) {
                        jsonWriter.name("os_type");
                        if (i != 0) {
                            C5590r0 r0Var = C5590r0.DEBUG_PARAM_UNKNOWN;
                            if (i - 1 != 0) {
                                jsonWriter.value("ANDROID");
                            } else {
                                jsonWriter.value("UNKNOWN");
                            }
                        } else {
                            throw null;
                        }
                    }
                    String str4 = s0Var.f28203a;
                    if (str4 != null) {
                        jsonWriter.name("model");
                        jsonWriter.value(str4);
                    }
                    Integer num = s0Var.f28204b;
                    if (num != null) {
                        jsonWriter.name("android_api_level");
                        jsonWriter.value(num);
                    }
                    jsonWriter.endObject();
                }
                String str5 = w0Var.f28226e;
                if (str5 != null) {
                    jsonWriter.name("language_code");
                    jsonWriter.value(str5);
                }
                Boolean bool2 = w0Var.f28227f;
                if (bool2 != null) {
                    jsonWriter.name("tag_for_under_age_of_consent");
                    jsonWriter.value(bool2.booleanValue());
                }
                Map<String, String> map = w0Var.f28228g;
                if (!map.isEmpty()) {
                    jsonWriter.name("stored_infos_map");
                    jsonWriter.beginObject();
                    for (Map.Entry next : map.entrySet()) {
                        jsonWriter.name((String) next.getKey());
                        jsonWriter.value((String) next.getValue());
                    }
                    jsonWriter.endObject();
                }
                C5599u0 u0Var = w0Var.f28229h;
                if (u0Var != null) {
                    jsonWriter.name("screen_info");
                    jsonWriter.beginObject();
                    Integer num2 = u0Var.f28212a;
                    if (num2 != null) {
                        jsonWriter.name("width");
                        jsonWriter.value(num2);
                    }
                    Integer num3 = u0Var.f28213b;
                    if (num3 != null) {
                        jsonWriter.name("height");
                        jsonWriter.value(num3);
                    }
                    Double d = u0Var.f28214c;
                    if (d != null) {
                        jsonWriter.name("density");
                        jsonWriter.value(d);
                    }
                    List<C5596t0> list = u0Var.f28215d;
                    if (!list.isEmpty()) {
                        jsonWriter.name("screen_insets");
                        jsonWriter.beginArray();
                        for (C5596t0 next2 : list) {
                            jsonWriter.beginObject();
                            Integer num4 = next2.f28207a;
                            if (num4 != null) {
                                jsonWriter.name("top");
                                jsonWriter.value(num4);
                            }
                            Integer num5 = next2.f28208b;
                            if (num5 != null) {
                                jsonWriter.name("left");
                                jsonWriter.value(num5);
                            }
                            Integer num6 = next2.f28209c;
                            if (num6 != null) {
                                jsonWriter.name("right");
                                jsonWriter.value(num6);
                            }
                            Integer num7 = next2.f28210d;
                            if (num7 != null) {
                                jsonWriter.name("bottom");
                                jsonWriter.value(num7);
                            }
                            jsonWriter.endObject();
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                }
                C5587q0 q0Var = w0Var.f28230i;
                if (q0Var != null) {
                    jsonWriter.name("app_info");
                    jsonWriter.beginObject();
                    String str6 = q0Var.f28190a;
                    if (str6 != null) {
                        jsonWriter.name("package_name");
                        jsonWriter.value(str6);
                    }
                    String str7 = q0Var.f28191b;
                    if (str7 != null) {
                        jsonWriter.name("publisher_display_name");
                        jsonWriter.value(str7);
                    }
                    String str8 = q0Var.f28192c;
                    if (str8 != null) {
                        jsonWriter.name(MediationMetaData.KEY_VERSION);
                        jsonWriter.value(str8);
                    }
                    jsonWriter.endObject();
                }
                C5602v0 v0Var = w0Var.f28231j;
                if (v0Var != null) {
                    jsonWriter.name("sdk_info");
                    jsonWriter.beginObject();
                    String str9 = v0Var.f28218a;
                    if (str9 != null) {
                        jsonWriter.name(MediationMetaData.KEY_VERSION);
                        jsonWriter.value(str9);
                    }
                    jsonWriter.endObject();
                }
                List<C5590r0> list2 = w0Var.f28232k;
                if (!list2.isEmpty()) {
                    jsonWriter.name("debug_params");
                    jsonWriter.beginArray();
                    for (C5590r0 ordinal : list2) {
                        C5590r0 r0Var2 = C5590r0.DEBUG_PARAM_UNKNOWN;
                        int ordinal2 = ordinal.ordinal();
                        if (ordinal2 == 0) {
                            jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                        } else if (ordinal2 == 1) {
                            jsonWriter.value("ALWAYS_SHOW");
                        } else if (ordinal2 == 2) {
                            jsonWriter.value("GEO_OVERRIDE_EEA");
                        } else if (ordinal2 == 3) {
                            jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                        } else if (ordinal2 == 4) {
                            jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                        }
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
                jsonWriter.close();
                outputStreamWriter.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        C5611y0 a = C5611y0.m33687a(new JsonReader(new StringReader(headerField)));
                        a.f28242a = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return a;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        jsonReader = new JsonReader(bufferedReader);
                        C5611y0 a2 = C5611y0.m33687a(jsonReader);
                        jsonReader.close();
                        bufferedReader.close();
                        return a2;
                    } catch (Throwable th) {
                        bufferedReader.close();
                        throw th;
                    }
                } else {
                    String next3 = new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next();
                    StringBuilder sb = new StringBuilder(String.valueOf(next3).length() + 31);
                    sb.append("Http error code - ");
                    sb.append(responseCode);
                    sb.append(".\n");
                    sb.append(next3);
                    throw new IOException(sb.toString());
                }
                throw th;
                throw th;
            } catch (Throwable th2) {
                outputStreamWriter.close();
                throw th2;
            }
        } catch (SocketTimeoutException e) {
            throw new C5600u1(4, "The server timed out.", e);
        } catch (IOException e2) {
            throw new C5600u1(2, "Error making request.", e2);
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo19853a(C13053c.C13055b bVar) {
        Handler handler = this.f28096c;
        bVar.getClass();
        handler.post(new C5550f2(bVar));
    }

    /* renamed from: b */
    public final /* synthetic */ void mo19854b(Activity activity, C13056d dVar, C13053c.C13055b bVar, C13053c.C13054a aVar) {
        String str;
        try {
            C13049a a = dVar.mo38086a();
            if (a == null || !a.mo38082b()) {
                String a2 = C5614z0.m33700a(this.f28094a);
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 95);
                sb.append("Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"");
                sb.append(a2);
                sb.append("\") to set this as a debug device.");
                Log.i("UserMessagingPlatform", sb.toString());
            }
            C5531b a3 = new C5566j2(this.f28101h, m33608d(this.f28100g.mo19910d(activity, dVar))).mo19869a();
            this.f28098e.mo19884f(a3.f28057a);
            this.f28099f.mo19840b(a3.f28058b);
            this.f28102i.mo19893a().execute(new C5538c2(this, bVar));
        } catch (C5600u1 e) {
            this.f28096c.post(new C5542d2(aVar, e));
        } catch (RuntimeException e2) {
            String valueOf = String.valueOf(Log.getStackTraceString(e2));
            if (valueOf.length() != 0) {
                str = "Caught exception when trying to request consent info update: ".concat(valueOf);
            } else {
                str = new String("Caught exception when trying to request consent info update: ");
            }
            this.f28096c.post(new C5546e2(aVar, new C5600u1(1, str)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo19855c(Activity activity, C13056d dVar, C13053c.C13055b bVar, C13053c.C13054a aVar) {
        this.f28097d.execute(new C5534b2(this, activity, dVar, bVar, aVar));
    }
}
