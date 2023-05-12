# FizzBuzz
Hello Project FizzBuzz

To change the password for a fence device configured with Red Hat Enterprise Linux (RHEL) to control a vCenter server, you can follow these steps:

1. Log in to the RHEL system where the fence device is configured using a user account with administrative privileges.

2. Open the fencing configuration file in a text editor. This file is typically located at `/etc/cluster/fence_xvm.conf`.

3. Locate the section of the configuration file that defines the fence device for your vCenter server. This section will start with a line similar to the following:

   ```
   <fencedevice name="my-vcenter" agent="fence_vmware_soap" ipaddr="192.168.1.100" login="myuser" passwd="mypassword" ssl="1" />
   ```

   Note that the `passwd` attribute contains the current password for the fence device.

4. Replace the current password in the `passwd` attribute with the new password that you want to use. For example:

   ```
   <fencedevice name="my-vcenter" agent="fence_vmware_soap" ipaddr="192.168.1.100" login="myuser" passwd="newpassword" ssl="1" />
   ```

5. Save the changes to the configuration file.

6. Test the new password by running the `fence_vmware_soap` command with the `-o status` option and specifying the fence device name. For example:

   ```
   fence_vmware_soap -a 192.168.1.100 -l myuser -p newpassword -o status -n my-vcenter
   ```

   If the command returns a status of `ON` for the fence device, then the new password is working correctly.

7. Restart the cluster service to ensure that the new fence device configuration is used. You can do this with the following command:

   ```
   systemctl restart pacemaker
   ```

   Note that this will cause any active cluster resources to be temporarily stopped and started again, so you should plan the restart accordingly.
