package p247h8;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/* renamed from: h8.s */
/* compiled from: FileUtil */
public class C10463s {

    /* renamed from: h8.s$a */
    /* compiled from: FileUtil */
    private static class C10464a {
        /* renamed from: a */
        public static void m52764a(File file) throws IOException {
            try {
                Files.deleteIfExists(file.toPath());
            } catch (IOException e) {
                throw new IOException("Failed to delete file " + file + ": " + e);
            }
        }
    }

    /* renamed from: h8.s$b */
    /* compiled from: FileUtil */
    private static class C10465b {
        /* renamed from: a */
        public static void m52765a(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                throw new IOException("Failed to delete file " + file);
            }
        }
    }

    /* renamed from: a */
    public static void m52763a(File file) throws IOException {
        if (Build.VERSION.SDK_INT >= 26) {
            C10464a.m52764a(file);
        } else {
            C10465b.m52765a(file);
        }
    }
}
