const UserProfileBuilder = require('../builders/UserProfileBuilder');

try {
  //  Profile 1: Rithanya 
  const rithanya = new UserProfileBuilder("rithanya", "rithanya@example.com")
    .withPhone("+91-9876543210")
    .withBio("Final-year CCE student passionate about transportation tech and design systems.")
    .withProfilePicture("/assets/profiles/rithanya.png")
    .withPreferences({ darkMode: true, language: "en" })
    .withLinkedAccounts(["GitHub", "LinkedIn"])
    .isVerified(true)
    .withRole("admin")
    .build();

  //  Profile 2: 
  const aarav = new UserProfileBuilder("aarav", "aarav@example.com")
    .withBio("Software Developer who loves clean architecture.")
    .withPreferences({ darkMode: false, notifications: false })
    .isVerified(true)
    .withRole("developer")
    .build();

  //  Output both profiles
  console.log(" User Profiles Created:");
  console.log("\n Rithanya:\n", rithanya);
  console.log("\n Aarav:\n", aarav);

} catch (error) {
  console.error(" Failed to build user profile:", error.message);
}
