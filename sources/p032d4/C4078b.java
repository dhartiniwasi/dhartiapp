package p032d4;

import android.net.Uri;
import java.util.Map;

/* renamed from: d4.b */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
final class C4078b extends Thread {

    /* renamed from: a */
    final /* synthetic */ Map f23228a;

    C4078b(C4076a aVar, Map map) {
        this.f23228a = map;
    }

    public final void run() {
        Map map = this.f23228a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        C4080d.m28022a(buildUpon.build().toString());
    }
}
