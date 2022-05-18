package io.digiline.secretideplugin

import Icons.SdkIcons
import com.intellij.ide.util.projectWizard.ModuleWizardStep
import com.intellij.ide.util.projectWizard.WizardContext
import com.intellij.openapi.module.ModuleType
import com.intellij.openapi.module.ModuleTypeManager
import com.intellij.openapi.roots.ui.configuration.ModulesProvider
import javax.swing.Icon

class SecretIDESNIP721ModuleType : ModuleType<SecretIDESNIP721ModuleBuilder>(ID) {
  override fun createModuleBuilder(): SecretIDESNIP721ModuleBuilder {
    return SecretIDESNIP721ModuleBuilder()
  }

  override fun getName(): String {
    return "Secret Network SNIP721 Contract"
  }

  override fun getDescription(): String {
    return "Secret Network SNIP721 contract"
  }

  override fun getNodeIcon(b: Boolean): Icon {
    return SdkIcons.Sdk_default_icon
  }

  override fun createWizardSteps(
    wizardContext: WizardContext,
    moduleBuilder: SecretIDESNIP721ModuleBuilder,
    modulesProvider: ModulesProvider
  ): Array<ModuleWizardStep> {
    return super.createWizardSteps(wizardContext, moduleBuilder, modulesProvider)
  }

  companion object {
    private const val ID = "SCRT_NETWORK_SNIP721_MODULE_TYPE"
    val instance: SecretIDESNIP721ModuleType
      get() = ModuleTypeManager.getInstance().findByID(ID) as SecretIDESNIP721ModuleType
  }
}
