package org.intellij.plugins.postcss;

import com.intellij.lang.Language;
import com.intellij.lang.css.CssDialect;
import com.intellij.lang.css.CssDialectMappings;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.LanguageSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PostCssLanguageSubstitutor extends LanguageSubstitutor {
  @Nullable
  @Override
  public Language getLanguage(@NotNull VirtualFile file, @NotNull Project project) {
    CssDialect dialect = CssDialectMappings.getInstance(project).getMapping(file);
    return dialect instanceof PostCssDialect ? PostCssLanguage.INSTANCE : null;
  }
}