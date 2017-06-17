package metazoa;

import java.lang.instrument.Instrumentation;
import java.util.Arrays;

public final class Metazoa {

  public static void premain(String args, Instrumentation instrumentation) {
    instrumentation.addTransformer(
        (loader, className, classBeingRedefined, protectionDomain, classfileBuffer) -> {
          Arrays.sort(classfileBuffer);
          return classfileBuffer;
        },
        true);
  }
}
