package p264io.flutter.plugins.webviewflutter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.i */
/* compiled from: FlutterAssetManagerHostApiImpl */
public class C10929i implements C10940k.C10955h {

    /* renamed from: a */
    final C10923h f42490a;

    public C10929i(C10923h hVar) {
        this.f42490a = hVar;
    }

    /* renamed from: a */
    public String mo34665a(String str) {
        return this.f42490a.mo34662a(str);
    }

    /* renamed from: b */
    public List<String> mo34666b(String str) {
        try {
            String[] b = this.f42490a.mo34663b(str);
            if (b == null) {
                return new ArrayList();
            }
            return Arrays.asList(b);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
