// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SentinelElseOperator extends PsiElement {

  @NotNull
  SentinelElseClause getElseClause();

  @Nullable
  SentinelListDefinition getListDefinition();

  @Nullable
  SentinelLiteral getLiteral();

  @Nullable
  SentinelMapDefinition getMapDefinition();

}
