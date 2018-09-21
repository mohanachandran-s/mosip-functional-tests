package org.mosip.auth.core.spi.otpgen.facade;

import org.mosip.auth.core.dto.indauth.OtpRequestDTO;
import org.mosip.auth.core.exception.IdAuthenticationBusinessException;

/**
 * Facade service to generate OTP.
 * 
 * @author Rakesh Roshan
 */
public interface OTPFacade {
	boolean generateOtp(OtpRequestDTO otpKey) throws IdAuthenticationBusinessException;
}
