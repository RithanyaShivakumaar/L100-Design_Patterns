export interface UserPreferences {
  darkMode?: boolean;
  language?: string;
  notifications?: boolean;
}

export interface IUserProfile {
  username: string;
  email: string;
  phone?: string | null;
  bio?: string;
  profilePicture?: string;
  preferences?: UserPreferences;
  linkedAccounts?: string[];
  isVerified?: boolean;
  role?: string;
}
