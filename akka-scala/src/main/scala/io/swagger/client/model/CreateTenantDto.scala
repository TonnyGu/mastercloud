/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class CreateTenantDto (
  /* 租户编号 */
  code: String,
  /* 租户名称 */
  displayName: String,
  /* 租户描述 */
  desc: Option[String],
  /* 租户管理员邮箱 */
  adminEmail: String,
  adminPassword: String,
  /* 下次登录时密码重置 */
  shouldChangePasswordOnNextLogin: Option[Boolean],
  /* 是否激活租户 */
  isActive: Option[Boolean],
  /* 租户过期时间 */
  expiryTime: Option[Double]
) extends ApiModel


