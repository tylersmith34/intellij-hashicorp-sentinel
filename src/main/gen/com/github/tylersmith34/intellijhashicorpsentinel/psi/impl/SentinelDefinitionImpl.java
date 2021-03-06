// This is a generated file. Not intended for manual editing.
package com.github.tylersmith34.intellijhashicorpsentinel.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.tylersmith34.intellijhashicorpsentinel.SentinelTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.tylersmith34.intellijhashicorpsentinel.psi.*;

public class SentinelDefinitionImpl extends ASTWrapperPsiElement implements SentinelDefinition {

  public SentinelDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SentinelVisitor visitor) {
    visitor.visitDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SentinelVisitor) accept((SentinelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SentinelExternalParameters getExternalParameters() {
    return findChildByClass(SentinelExternalParameters.class);
  }

  @Override
  @Nullable
  public SentinelFunctionDeclaration getFunctionDeclaration() {
    return findChildByClass(SentinelFunctionDeclaration.class);
  }

  @Override
  @Nullable
  public SentinelGlobalVariableDefinition getGlobalVariableDefinition() {
    return findChildByClass(SentinelGlobalVariableDefinition.class);
  }

  @Override
  @Nullable
  public SentinelImportStatement getImportStatement() {
    return findChildByClass(SentinelImportStatement.class);
  }

  @Override
  @Nullable
  public SentinelMainRule getMainRule() {
    return findChildByClass(SentinelMainRule.class);
  }

  @Override
  @Nullable
  public SentinelRuleDefinition getRuleDefinition() {
    return findChildByClass(SentinelRuleDefinition.class);
  }

}
